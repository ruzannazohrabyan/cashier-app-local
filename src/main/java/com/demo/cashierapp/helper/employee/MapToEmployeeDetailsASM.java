package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.model.apiService.employee.EmployeeDetailsASM;
import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;

import java.util.stream.Collectors;

public class MapToEmployeeDetailsASM {
    public EmployeeDetailsASM from(EmployeeDetailsSM employeeDetailsSM) {

        EmployeeDetailsASM model = new EmployeeDetailsASM();
        model.setFirstName(employeeDetailsSM.getFirstName());
        model.setLastName(employeeDetailsSM.getLastName());
        model.setUsername(employeeDetailsSM.getUsername());
        model.setRoleASMList(employeeDetailsSM.getRoleSMList()
                .stream()
                .map(roleSM -> new MapToRoleASM().from(roleSM))
                .collect(Collectors.toList())
        );
        return model;
    }
}
