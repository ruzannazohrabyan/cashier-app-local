package com.demo.cashierapp.apiService.employee;

import com.demo.cashierapp.model.apiService.employee.*;
import java.util.List;

public interface EmployeeApiService {
    CreateEmployeeResponseASM create(CreateEmployeeRequestASM createEmployeeRequestASM);

    List<EmployeeDetailsASM> getAll();

    EmployeeDetailsASM getByUsername(String username);

    void deleteByUsername(String username);

    EditEmployeeResponseASM edit(EditEmployeeRequestASM editEmployeeRequestASM);
}
