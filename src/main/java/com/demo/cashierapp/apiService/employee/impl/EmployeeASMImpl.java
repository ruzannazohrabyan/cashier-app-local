package com.demo.cashierapp.apiService.employee.impl;

import com.demo.cashierapp.apiService.employee.EmployeeASM;
import com.demo.cashierapp.helper.employee.MapToCreateEmployeeRequestSM;
import com.demo.cashierapp.model.apiService.employee.*;
import com.demo.cashierapp.model.apiService.role.RoleASM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;
import com.demo.cashierapp.service.employee.EmployeeService;
import com.demo.cashierapp.service.role.EmployeeRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeASMImpl implements EmployeeASM {
    private final EmployeeService employeeService;
    private final EmployeeRoleService employeeRoleService;
    @Override
    public CreateEmployeeResponseASM create(CreateEmployeeRequestASM createEmployeeRequestASM) {
        final CreateEmployeeResponseSM savedEmployee = employeeService.create(
                new MapToCreateEmployeeRequestSM().from(createEmployeeRequestASM)
        );

        for (RoleASM role : createEmployeeRequestASM.getRoleASMList()) {
            employeeRoleService.save(savedEmployee, role);
        }
        return null;
    }

    @Override
    public List<EmployeesDetailsASM> getAll() {
        return null;
    }

    @Override
    public EmployeesDetailsASM getByUsername(String username) {
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
