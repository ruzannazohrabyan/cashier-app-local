package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.model.apiService.employeeRole.EmployeeRoleASM;
import com.demo.cashierapp.model.service.employeeRole.EmployeeRoleSM;

public class MapToEmployeeRoleASM {
    public EmployeeRoleASM from(EmployeeRoleSM employeeRoleSM) {
        EmployeeRoleASM model = new EmployeeRoleASM();
        model.setEmployeeDetailsASM(new MapToEmployeeDetailsASM().from(employeeRoleSM.getEmployeeDetailsSM()));
        return model;
    }
}
