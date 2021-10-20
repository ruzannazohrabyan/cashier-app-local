package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.model.service.employeeRole.EmployeeRoleSM;

public class MapToEmployeeRoleSM {

    public EmployeeRoleSM from(EmployeeRole employeeRole) {
        EmployeeRoleSM model = new EmployeeRoleSM();
        model.setEmployeeDetailsSM(new MapToEmployeeDetailsSM().from(employeeRole.getEmployee()));
        model.setRoleSM(new MapToRoleSM().from(employeeRole.getRole()));
        return model;
    }
}
