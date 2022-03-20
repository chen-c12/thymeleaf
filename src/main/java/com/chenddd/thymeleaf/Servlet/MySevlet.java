package com.chenddd.thymeleaf.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 金鱼
 * @title: MySevlet
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1415:56
 */

//@WebServlet(urlPatterns = "/my")
public class MySevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("66666");
    }
}
