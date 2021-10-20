package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.model.apiService.employee.CreateEmployeeResponseASM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;

public class MapToCreateEmployeeResponseASM {

    public CreateEmployeeResponseASM from(CreateEmployeeResponseSM createEmployeeResponseSM) {
        CreateEmployeeResponseASM model = new CreateEmployeeResponseASM();
        model.setFirstName(createEmployeeResponseSM.getFirstName());
        model.setLastName(createEmployeeResponseSM.getLastName());
        model.setUsername(createEmployeeResponseSM.getUsername());
        model.setRoleSMList(createEmployeeResponseSM.getRoleSMList());
        return model;
    }
}
