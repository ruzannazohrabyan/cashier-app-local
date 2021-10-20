package com.demo.cashierapp.service.employee;

import com.demo.cashierapp.model.CreateEmployeeParams;
import com.demo.cashierapp.model.CreateEmployeeParamsResponse;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeResponseASM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeRequestSM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;
import com.demo.cashierapp.model.service.employee.EmployeesDetailsSM;

public interface EmployeeService {
    CreateEmployeeResponseSM create(CreateEmployeeRequestSM createEmployeeRequestSM);

//    ResponseEntity<EmployeeDetailsResponseModel> getById(Long id);
//
//    List<EmployeeDetailsResponseModel> getAll();
//
//    void delete(EmployeeParams employee);
//
//    void deleteById(Long id);
//
    EmployeesDetailsSM getEmployeeByUsername(String username);
//
//    boolean isUsernameExists(String username);
}
