package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.service.employee.CreateEmployeeRequestSM;

public class MapToCreateEmployeeEntity {

    public Employee from(CreateEmployeeRequestSM createEmployeeRequestSM) {
        final Employee entity = new Employee();
        entity.setFirstName(createEmployeeRequestSM.getFirstName());
        entity.setLastName(createEmployeeRequestSM.getLastName());
        entity.setUsername(createEmployeeRequestSM.getUsername());
        entity.setPassword(createEmployeeRequestSM.getPassword());
        return entity;
    }
}
