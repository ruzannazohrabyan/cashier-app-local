package com.demo.cashierapp.service.employee;

import com.demo.cashierapp.model.apiService.employee.EditEmployeeRequestASM;
import com.demo.cashierapp.model.apiService.employee.EditEmployeeResponseASM;
import com.demo.cashierapp.model.apiService.employee.EmployeeDetailsASM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeRequestSM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;
import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;

import java.util.List;

public interface EmployeeService {
    CreateEmployeeResponseSM create(CreateEmployeeRequestSM createEmployeeRequestSM);

    List<EmployeeDetailsSM> getAll();

    EmployeeDetailsSM getEmployeeByUsername(String username);

    EmployeeDetailsSM getByUsername(String username);

    void deleteByUsername(String username);

//    EditEmployeeResponseSM edit(EditEmployeeRequestASM editEmployeeRequestASM);
}
