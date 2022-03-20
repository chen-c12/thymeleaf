package com.chenddd.thymeleaf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenddd.thymeleaf.Bean.User;
import com.chenddd.thymeleaf.mapper.UserMapper;
import com.chenddd.thymeleaf.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 金鱼
 * @title: UserServiceImpl
 * @projectName thymeleaf
 * @description: UserService实现类
 * @date 2022/3/1720:21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService  {
}
