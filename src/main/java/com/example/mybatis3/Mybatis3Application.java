package com.example.mybatis3;

import com.example.mybatis3.mapper.EmployeeMapper;
import com.example.mybatis3.model.Employee;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatis3.mapper")
public class Mybatis3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis3Application.class, args);
    }

    @Autowired
    EmployeeMapper employeeMapper;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) {
        employeeMapper.deleteAll();
        employeeMapper.insert(new Employee(10011L, "Ramesh", "Fadatare", "ramesh@gmail.com"));
        employeeMapper.insert(new Employee(10012L, "John", "Cena", "john@gmail.com"));
        employeeMapper.insert(new Employee(10013L, "tony", "stark", "stark@gmail.com"));
        logger.info("Employee id 10011 -> {}", employeeMapper.findById(10011L));
        logger.info("Update 10003 -> {}", employeeMapper.update(new Employee(10011L, "ram", "Stark", "ramesh123@gmail.com")));
        logger.info("Delete 10003 -> {}", employeeMapper.deleteById(10013L));
        employeeMapper.findAll().forEach(System.out::println);
        employeeMapper.deleteAll();
    }
}
