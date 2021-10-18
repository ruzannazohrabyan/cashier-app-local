package com.demo.cashierapp.service.impl;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.repository.EmployeeRepository;
import com.demo.cashierapp.repository.EmployeeRoleRepository;
import com.demo.cashierapp.service.EmployeeParams;
import com.demo.cashierapp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public boolean isUsernameExists(String username) {
        Employee employee = employeeRepository.findUserByUsername(username);
        return employee != null;
    }

    @Override
    public Employee save(EmployeeParams employee) {
        final String salt = BCrypt.gensalt(10);
        Employee newEmployee = new Employee();
        newEmployee.setFirstName(employee.getFirstName());
        newEmployee.setLastName(employee.getLastName());
        newEmployee.setUsername(employee.getUsername());
        newEmployee.setPassword(BCrypt.hashpw(employee.getPassword(), salt));
        final Employee savedEmployee = employeeRepository.save(newEmployee);
        return savedEmployee;
    }

    @Override
    public ResponseEntity<Employee> getById(Long id) {
        Optional<Employee> user = employeeRepository.findById(id);
        if (user.isEmpty()) {
            return new ResponseEntity<>(new Employee(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user.get(), HttpStatus.OK);

    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee getEmployeeByUsername(String username) {
        return employeeRepository.findUserByUsername(username);
    }


}
