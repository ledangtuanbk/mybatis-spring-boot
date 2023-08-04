package com.example.mybatis3.mapper;

import com.example.mybatis3.model.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface EmployeeMapper {
    List<Employee> findAll();

    Employee findById(long id);

    //
    int deleteById(long id);

    int deleteAll();

    //
    int insert(Employee employee);

    //
    int update(Employee employee);
}