package com.chenddd.thymeleaf.service.impl;

import com.chenddd.thymeleaf.Bean.Employee;
import com.chenddd.thymeleaf.mapper.EmployeeMapper;
import com.chenddd.thymeleaf.service.EmployeeService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 金鱼
 * @title: EmployeeService
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/170:16
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    public Employee getEmployeeById(Integer id){
        Employee employee = employeeMapper.getEmployee(id);
        return employee;
    }
}
