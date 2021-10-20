package com.demo.cashierapp.service.employee.impl;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.helper.employee.MapToCreateEmployeeResponseSM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeRequestSM;
import com.demo.cashierapp.model.service.employee.CreateEmployeeResponseSM;
import com.demo.cashierapp.model.service.employee.EmployeesDetailsSM;
import com.demo.cashierapp.repository.EmployeeRepository;
import com.demo.cashierapp.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public boolean isUsernameExists(String username) {
        Employee employee = employeeRepository.findUserByUsername(username);
        return employee != null;
    }
//
//    @Override
//    public CreateEmployeeParamsResponse save(CreateEmployeeParams employee) {
//        final String salt = BCrypt.gensalt(10);
//        Employee newEmployee = new Employee();
//        newEmployee.setFirstName(employee.getFirstName());
//        newEmployee.setLastName(employee.getLastName());
//        newEmployee.setUsername(employee.getUsername());
//        newEmployee.setPassword(BCrypt.hashpw(employee.getPassword(), salt));
//        return employeeRepository.save(newEmployee);
//
//    }

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
    public EmployeesDetailsSM getEmployeeByUsername(String username) {
        employeeRepository.findUserByUsername(username);

        return null;
    }

//    @Override
//    public ResponseEntity<Employee> getById(Long id) {
//        Optional<Employee> user = employeeRepository.findById(id);
//        if (user.isEmpty()) {
//            return new ResponseEntity<>(new Employee(), HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(user.get(), HttpStatus.OK);
//
//    }
//
//    @Override
//    public List<Employee> getAll() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public void delete(Employee employee) {
//        employeeRepository.delete(employee);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        employeeRepository.deleteById(id);
//    }
//
//    @Override
//    public Employee getEmployeeByUsername(String username) {
//        return employeeRepository.findUserByUsername(username);
//    }


}
