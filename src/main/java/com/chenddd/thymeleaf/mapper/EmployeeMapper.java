package com.chenddd.thymeleaf.mapper;

import com.chenddd.thymeleaf.Bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 金鱼
 * @title: EmployeeMapper
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1617:42
 */
@Mapper
public interface EmployeeMapper {

    public Employee getEmployee(Integer id);
}
