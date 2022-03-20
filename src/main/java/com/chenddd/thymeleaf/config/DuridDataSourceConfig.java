package com.chenddd.thymeleaf.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @author 金鱼
 * @title: DuridDataSourceConfig
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1519:13
 */
//@Configuration
public class DuridDataSourceConfig {
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {

        DruidDataSource druidDataSource = new DruidDataSource();
        //加入监控功能

        return druidDataSource;
    }


    /**
     * 配置druid的监控页功能
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> viewServletServletRegistrationBean =
                new ServletRegistrationBean<>(statViewServlet, "/druid/*");

        viewServletServletRegistrationBean.addInitParameter("loginUsername", "chenddd");
        viewServletServletRegistrationBean.addInitParameter("loginPassword", "123456");
        return viewServletServletRegistrationBean;
    }


    /**
     * 对web进行监控
     * @return
     */
    @Bean
    public FilterRegistrationBean webFilter(){
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> webfilter =
                new FilterRegistrationBean<>(webStatFilter);
        webfilter.setUrlPatterns(Arrays.asList("/*"));
        webfilter.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");


        return webfilter;
    }


}
