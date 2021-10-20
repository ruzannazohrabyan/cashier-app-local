package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.service.employee.EmployeesDetailsSM;
import com.demo.cashierapp.model.service.role.RoleSM;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToEmployeeDetailsSM {

    public EmployeesDetailsSM from(Employee employee) {
        EmployeesDetailsSM model = new EmployeesDetailsSM();
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
