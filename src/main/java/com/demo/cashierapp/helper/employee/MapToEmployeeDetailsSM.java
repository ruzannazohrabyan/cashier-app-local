package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;
import com.demo.cashierapp.model.service.role.RoleSM;

import java.util.ArrayList;
import java.util.List;

public class MapToEmployeeDetailsSM {

    public EmployeeDetailsSM from(Employee employee) {
        EmployeeDetailsSM model = new EmployeeDetailsSM();
        model.setFirstName(employee.getFirstName());
        model.setLastName(employee.getLastName());
        model.setUsername(employee.getUsername());
        List<RoleSM> roleSMList = new ArrayList<>();
        for (EmployeeRole employeeRole : employee.getRoles()) {
            Role role = employeeRole.getRole();
            roleSMList.add(new MapToRoleSM().from(role));
        }
        model.setRoleSMList(roleSMList);
        return model;
    }
}
