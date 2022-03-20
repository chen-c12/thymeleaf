package com.chenddd.thymeleaf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenddd.thymeleaf.Bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 金鱼
 * @title: UserMapper
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1717:53
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
