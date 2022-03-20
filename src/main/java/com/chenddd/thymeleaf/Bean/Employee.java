package com.chenddd.thymeleaf.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 金鱼
 * @title: Employee
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1618:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String last_name;
    private String gender;
    private String email;
    private Integer d_id;
}
