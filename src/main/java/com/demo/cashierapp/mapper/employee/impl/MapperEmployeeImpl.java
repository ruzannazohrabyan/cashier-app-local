package com.demo.cashierapp.mapper.employee.impl;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.mapper.employee.MapperEmployee;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeRequestModel;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeResponseModel;
import com.demo.cashierapp.model.apiService.employee.EmployeeDetailsModel;
import com.demo.cashierapp.model.service.employee.CreateEmployeeParams;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MapperEmployeeImpl implements MapperEmployee {

    public CreateEmployeeParams mapToCreateEmployeeParams(CreateEmployeeRequestModel createEmployeeRequestModel) {
        return new CreateEmployeeParams(
                createEmployeeRequestModel.getUsername(),
                createEmployeeRequestModel.getPassword(),
                createEmployeeRequestModel.getFirstName(),
                createEmployeeRequestModel.getLastName()
        );
    }

    @Override
    public CreateEmployeeResponseModel mapToCreateEmployeeResponse(Employee employee, List<Role> roles) {
        final CreateEmployeeResponseModel model = new CreateEmployeeResponseModel();
        model.setUsername(employee.getUsername());
        model.setFirstName(employee.getFirstName());
        model.setLastName(employee.getLastName());
        model.setRoleList(roles);
        return model;
    }

    @Override
    public EmployeeDetailsModel mapToEmployeeDetailsModel(Employee employee, List<Role> roles) {
        final EmployeeDetailsModel model = new EmployeeDetailsModel();
        model.setUsername(employee.getUsername());
        model.setFirstName(employee.getFirstName());
        model.setLastName(employee.getLastName());
        model.setRoleList(roles);
        return model;
    }

}
