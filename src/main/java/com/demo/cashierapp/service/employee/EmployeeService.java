package com.demo.cashierapp.service.employee;

import com.demo.cashierapp.model.service.employee.CreateEmployeeRequestSM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;
import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;

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
    EmployeeDetailsSM getEmployeeByUsername(String username);
//
//    boolean isUsernameExists(String username);
}
