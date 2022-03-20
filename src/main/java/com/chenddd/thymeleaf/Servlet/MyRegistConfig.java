package com.chenddd.thymeleaf.Servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author 金鱼
 * @title: MyRegistConfig
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1416:26
 */
@Configuration
public class MyRegistConfig {

    @Bean
    public ServletRegistrationBean myServlet(){
        MySevlet mySevlet = new MySevlet();
        return new ServletRegistrationBean(mySevlet,"/my");
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter = new MyFilter();
//        return new FilterRegistrationBean(myFilter,myServlet());
        FilterRegistrationBean myFilterFilterRegistrationBean = new FilterRegistrationBean(myFilter);
        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/my1","/my2"));
        return myFilterFilterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyServletContextListener myServletContextListener = new MyServletContextListener();
        return new ServletListenerRegistrationBean(myServletContextListener);
    }
}
