package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.service.employee.EmployeesDetailsSM;

public class MapToEmployeeEntity {
    public Employee from(EmployeesDetailsSM employeesDetailsSM) {
        final Employee employee = new Employee();
        employee.setFirstName(employeesDetailsSM.getFirstName());
        employee.setLastName(employeesDetailsSM.getLastName());
        employee.setUsername(employeesDetailsSM.getUsername());
        return employee;
    }

}
