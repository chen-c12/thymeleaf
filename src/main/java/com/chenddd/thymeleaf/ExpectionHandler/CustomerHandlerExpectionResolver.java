package com.chenddd.thymeleaf.ExpectionHandler;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 金鱼
 * @title: CustomerHandlerExpectionResolver
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1411:14
 */
//@Order(value = Ordered.HIGHEST_PRECEDENCE) //数字越小优先级越高
//@Component
//public class CustomerHandlerExpectionResolver implements HandlerExceptionResolver {
//    @Override
//    public ModelAndView resolveException(HttpServletRequest request,
//                                         HttpServletResponse response,
//                                         Object handler, Exception ex) {
//        try {
//            response.sendError(511, "普通异常");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return new ModelAndView();
//    }
//}
