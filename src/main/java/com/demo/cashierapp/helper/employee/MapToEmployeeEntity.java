package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;

public class  MapToEmployeeEntity {
    public Employee from(EmployeeDetailsSM employeeDetailsSM) {
        final Employee employee = new Employee();
        employee.setFirstName(employeeDetailsSM.getFirstName());
        employee.setLastName(employeeDetailsSM.getLastName());
        employee.setUsername(employeeDetailsSM.getUsername());
        return employee;
    }

}
