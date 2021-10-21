package com.demo.cashierapp.api.service.employee.impl;

import com.demo.cashierapp.api.service.employee.EmployeeApiService;
import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.mapper.employee.MapperEmployee;
import com.demo.cashierapp.model.apiService.employee.*;
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
    private final MapperEmployee mapperEmployee;

    @Override
    public CreateEmployeeResponseModel create(CreateEmployeeRequestModel createEmployeeRequestModel) {
        final Employee savedEmployee = employeeService.create(mapperEmployee.mapToCreateEmployeeParams(createEmployeeRequestModel));

        List<EmployeeRole> employeeRoles = new ArrayList<>();
        for (Role role : createEmployeeRequestModel.getRoles()) {
            employeeRoles.add(
                    employeeRoleService.assign(savedEmployee.getUsername(), role)
            );
        }
        savedEmployee.setRoles(employeeRoles);
        final List<Role> roles = employeeRoleService.getAllRolesByUsername(savedEmployee.getUsername());
        return mapperEmployee.mapToCreateEmployeeResponse(savedEmployee, roles);
    }

    @Override
    public List<EmployeeDetailsModel> getAll() {
        final List<EmployeeDetailsModel> detailsModelList = new ArrayList<>();
        final List<Employee> employees = employeeService.getAll();
        for(Employee employee : employees) {
            final List<Role> roles = employeeRoleService.getAllRolesByUsername(employee.getUsername());
            detailsModelList.add(mapperEmployee.mapToEmployeeDetailsModel(employee, roles));
        }
        return detailsModelList;
    }

    @Override
    public EmployeeDetailsModel getByUsername(String username) {
        return null;

    }

    @Override
    public void deleteByUsername(String username) {
        employeeService.deleteByUsername(username);
    }

    @Override
    public EditEmployeeResponseModel edit(EditEmployeeRequestModel editEmployeeRequestModel) {
        return null;
    }
}
