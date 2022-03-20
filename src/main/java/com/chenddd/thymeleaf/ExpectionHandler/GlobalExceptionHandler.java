package com.chenddd.thymeleaf.ExpectionHandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 金鱼
 * @title: GlobalExceptionHandler
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1318:10
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class,NullPointerException.class})
    public String handleArithException(Exception ex){
        log.error("异常是：{}", ex);
        return "login";
    }

}
