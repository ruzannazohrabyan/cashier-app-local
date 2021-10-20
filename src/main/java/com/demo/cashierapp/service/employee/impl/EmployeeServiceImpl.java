package com.demo.cashierapp.service.employee.impl;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.helper.employee.MapToCreateEmployeeResponseSM;
import com.demo.cashierapp.helper.employee.MapToEmployeeDetailsSM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeRequestSM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;
import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;
import com.demo.cashierapp.repository.EmployeeRepository;
import com.demo.cashierapp.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public boolean isUsernameExists(String username) {
        Employee employee = employeeRepository.findUserByUsername(username);
        return employee != null;
    }

    @Override
    public CreateEmployeeResponseSM create(CreateEmployeeRequestSM createEmployeeRequestSM) {
        final String salt = BCrypt.gensalt(10);
        Employee newEmployee = new Employee();
        newEmployee.setFirstName(createEmployeeRequestSM.getFirstName());
        newEmployee.setLastName(createEmployeeRequestSM.getLastName());
        newEmployee.setUsername(createEmployeeRequestSM.getUsername());
        newEmployee.setPassword(BCrypt.hashpw(createEmployeeRequestSM.getPassword(), salt));
        Employee savedEmployee = employeeRepository.save(newEmployee);
        return new MapToCreateEmployeeResponseSM().from(savedEmployee);
    }

    @Override
    public List<EmployeeDetailsSM> getAll() {
        return employeeRepository.findAll()
                .stream()
                .map(employee -> new MapToEmployeeDetailsSM().from(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDetailsSM getEmployeeByUsername(String username) {
        employeeRepository.findUserByUsername(username);

        return null;
    }

    @Override
    public EmployeeDetailsSM getByUsername(String username) {
        return null;
    }

    @Override
    public void deleteByUsername(String username) {

    }

}
