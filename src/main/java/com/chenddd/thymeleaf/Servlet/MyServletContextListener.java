package com.chenddd.thymeleaf.Servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;

/**
 * @author 金鱼
 * @title: MyServletContextListener
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1416:07
 */
@Slf4j
//@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("MyServletContextListener监听项目初始化完成");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("MyServletContextListener监听项目销毁");
    }
}
