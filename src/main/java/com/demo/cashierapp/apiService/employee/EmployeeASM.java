package com.demo.cashierapp.apiService.employee;

import com.demo.cashierapp.model.apiService.employee.*;
import java.util.List;

public interface EmployeeASM {
    CreateEmployeeResponseASM create(CreateEmployeeRequestASM createEmployeeRequestASM);

    List<EmployeesDetailsASM> getAll();

    EmployeesDetailsASM getByUsername(String username);

    void deleteByUsername(String username);

    EditEmployeeResponseASM edit(EditEmployeeRequestASM editEmployeeRequestASM);
}
