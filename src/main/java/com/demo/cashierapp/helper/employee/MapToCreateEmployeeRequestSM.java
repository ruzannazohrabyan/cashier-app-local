package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.model.apiService.employee.CreateEmployeeRequestASM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeRequestSM;

public class MapToCreateEmployeeRequestSM {

    public CreateEmployeeRequestSM from(CreateEmployeeRequestASM createEmployeeRequestASM) {
        CreateEmployeeRequestSM model = new CreateEmployeeRequestSM();
        model.setFirstName(createEmployeeRequestASM.getFirstName());
        model.setLastName(createEmployeeRequestASM.getLastName());
        model.setUsername(createEmployeeRequestASM.getUsername());
        model.setPassword(createEmployeeRequestASM.getPassword());
        return model;
    }
}
