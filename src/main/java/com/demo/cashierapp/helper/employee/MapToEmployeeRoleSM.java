package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.model.apiService.employeeRole.EmployeeRoleSM;

public class MapToEmployeeRoleSM {

    EmployeeRoleSM from(EmployeeRole employeeRole) {
        EmployeeRoleSM model = new EmployeeRoleSM();
        model.setEmployeesDetailsSM();
//        new MapToEmployeeDetailsSM().from(employeeRole.getEmployee())
    }
}
