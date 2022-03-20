package com.chenddd.thymeleaf;

import com.chenddd.thymeleaf.Bean.User;
import com.chenddd.thymeleaf.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

@Slf4j
@SpringBootTest
public class SpringBootTest11 {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoad(){
        List<Long> longList = jdbcTemplate.queryForList("select count(*) from tbl_dept", Long.class);
        log.info("记录总数：{}",longList);

        log.info("数据源类型是{}",dataSource.getClass());
    }

    @Test
    void select(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
