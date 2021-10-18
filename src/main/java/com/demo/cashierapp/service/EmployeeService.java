package com.demo.cashierapp.service;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.model.EmployeeDetailsResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    Employee save(EmployeeParams employee);

    ResponseEntity<Employee> getById(Long id);

    List<Employee> getAll();

    void delete(Employee employee);

    void deleteById(Long id);

    Employee getEmployeeByUsername(String username);

    boolean isUsernameExists(String username);
}
