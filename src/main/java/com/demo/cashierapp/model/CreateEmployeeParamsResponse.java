package com.demo.cashierapp.model;

import com.demo.cashierapp.entity.EmployeeRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateEmployeeParamsResponse {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private List<EmployeeRole> employeeRoles;
}
