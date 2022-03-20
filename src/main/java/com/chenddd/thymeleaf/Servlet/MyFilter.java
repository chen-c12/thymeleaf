package com.chenddd.thymeleaf.Servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author 金鱼
 * @title: MyFilter
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1416:02
 */
@Slf4j
//@WebFilter(urlPatterns = {"/css/*","/images/*"})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("Filter初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("MyFilter工作");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        log.info("Filter销毁");
    }
}
