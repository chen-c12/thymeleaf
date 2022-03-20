package com.chenddd.thymeleaf.service;

import com.chenddd.thymeleaf.Bean.Employee;

/**
 * @author 金鱼
 * @title: EmployeeService
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1720:11
 */
public interface EmployeeService {
    public Employee getEmployeeById(Integer id);
}
