package com.demo.cashierapp.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeParams {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
}
