package com.demo.cashierapp.apiService.employee.impl;

import com.demo.cashierapp.apiService.employee.EmployeeApiService;
import com.demo.cashierapp.helper.employee.MapToCreateEmployeeRequestSM;
import com.demo.cashierapp.helper.employee.MapToCreateEmployeeResponseASM;
import com.demo.cashierapp.helper.employee.MapToRoleSM;
import com.demo.cashierapp.model.apiService.employee.*;
import com.demo.cashierapp.model.apiService.role.RoleASM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;
import com.demo.cashierapp.model.service.employeeRole.EmployeeRoleSM;
import com.demo.cashierapp.model.service.role.RoleSM;
import com.demo.cashierapp.service.employee.EmployeeService;
import com.demo.cashierapp.service.role.EmployeeRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeApiServiceImpl implements EmployeeApiService {
    private final EmployeeService employeeService;
    private final EmployeeRoleService employeeRoleService;

    @Override
    public CreateEmployeeResponseASM create(CreateEmployeeRequestASM createEmployeeRequestASM) {
        final CreateEmployeeResponseSM savedEmployee = employeeService.create(
                new MapToCreateEmployeeRequestSM().from(createEmployeeRequestASM)
        );

        List<RoleSM> roleSMList = new ArrayList<>();
        List<EmployeeRoleSM> employeeRoleSMList = new ArrayList<>();
        for (RoleASM role : createEmployeeRequestASM.getRoleASMList()) {
            employeeRoleSMList.add(employeeRoleService.assign(savedEmployee.getUsername(), new MapToRoleSM().from(role)));
            roleSMList.add(new MapToRoleSM().from(role));
        }
        savedEmployee.setRoleSMList(roleSMList);
        return new MapToCreateEmployeeResponseASM().from(savedEmployee);
    }

    @Override
    public List<EmployeeDetailsASM> getAll() {
        return null;
    }

    @Override
    public EmployeeDetailsASM getByUsername(String username) {
        return null;
    }

    @Override
    public void deleteByUsername(String username) {

    }

    @Override
    public EditEmployeeResponseASM edit(EditEmployeeRequestASM editEmployeeRequestASM) {
        return null;
    }
}
