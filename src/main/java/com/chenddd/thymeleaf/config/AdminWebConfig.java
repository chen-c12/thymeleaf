package com.chenddd.thymeleaf.config;

import com.chenddd.thymeleaf.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 金鱼
 * @title: AdminWebConfig
 * @projectName thymeleaf
 * @description:
 * 1.编写一个拦截器实现HandlerInterceptor接口
 * 2.拦截器注册到容器中（实现WebMvcConfigurer的addInterceptors）
 * 3.指定拦截规则【如果是拦截所有，静态资源会被拦截】
 * @date 2022/3/1114:19
 */
//@EnableWebMvc
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");
    }
}
