package com.chenddd.thymeleaf.ExpectionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author 金鱼
 * @title: UserExpectionHandler
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1322:29
 */

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量太多")
public class UserExpectionHandler extends RuntimeException {

    public UserExpectionHandler(){}

    public UserExpectionHandler(String message){
        super(message);
    }
}
