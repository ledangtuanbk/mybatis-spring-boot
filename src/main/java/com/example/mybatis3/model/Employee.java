package com.example.mybatis3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String emailId;


}