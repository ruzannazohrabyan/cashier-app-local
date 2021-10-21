package com.demo.cashierapp.service.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.service.employee.CreateEmployeeParams;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee create(CreateEmployeeParams createEmployeeParams);

    List<Employee> getAll();

    Optional<Employee> getEmployeeByUsername(String username);

    boolean isUsernameExist(String username);

    void deleteByUsername(String username);


}
