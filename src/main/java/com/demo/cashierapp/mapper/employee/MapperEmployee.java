package com.demo.cashierapp.mapper.employee;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeRequestModel;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeResponseModel;
import com.demo.cashierapp.model.apiService.employee.EmployeeDetailsModel;
import com.demo.cashierapp.model.service.employee.CreateEmployeeParams;

import java.util.List;

public interface MapperEmployee {
    CreateEmployeeParams mapToCreateEmployeeParams(CreateEmployeeRequestModel createEmployeeRequestModel);

    CreateEmployeeResponseModel mapToCreateEmployeeResponse(Employee employee, List<Role> roles);

    EmployeeDetailsModel mapToEmployeeDetailsModel(Employee employee, List<Role> roles);
}
