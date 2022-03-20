package com.chenddd.thymeleaf.Bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 金鱼
 * @title: User
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/920:17
 */

@Data
public class User {
    @TableField(exist = false)
    private String username;
    @TableField(exist = false)
    private String password;

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
