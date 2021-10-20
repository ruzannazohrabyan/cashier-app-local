package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;

public class MapToCreateEmployeeResponseSM {

    public CreateEmployeeResponseSM from(Employee employee) {
        CreateEmployeeResponseSM model = new CreateEmployeeResponseSM();
        model.setFirstName(employee.getFirstName());
        model.setLastName(employee.getLastName());
        model.setUsername(employee.getUsername());
        return model;
    }

}
