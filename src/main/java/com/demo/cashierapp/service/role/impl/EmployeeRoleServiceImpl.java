package com.demo.cashierapp.service.role.impl;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.helper.employee.MapToEmployeeEntity;
import com.demo.cashierapp.helper.employee.MapToRoleEntity;
import com.demo.cashierapp.model.apiService.employeeRole.EmployeeRoleSM;
import com.demo.cashierapp.model.service.employee.EmployeesDetailsSM;
import com.demo.cashierapp.model.service.role.RoleSM;
import com.demo.cashierapp.repository.EmployeeRoleRepository;
import com.demo.cashierapp.service.employee.EmployeeService;
import com.demo.cashierapp.service.role.EmployeeRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeRoleServiceImpl implements EmployeeRoleService {
    private final EmployeeRoleRepository employeeRoleRepository;
    private final EmployeeService employeeService;

    @Override
    public EmployeeRoleSM assign(String username, RoleSM roleSM) {
        final EmployeesDetailsSM model = employeeService.getEmployeeByUsername(username);
        final EmployeeRole employeeRole = new EmployeeRole();
        employeeRole.setEmployee(new MapToEmployeeEntity().from(model));
        employeeRole.setRole(new MapToRoleEntity().from(roleSM));
        final EmployeeRoleSM savedEmployeeRole = employeeRoleRepository.save(employeeRole);
        return savedEmployeeRole;
    }

//    @Override
//    public EmployeeRole save(Employee employee, RoleSM role) {
//        final EmployeeRole employeeRole = new EmployeeRole();
//        employeeRole.setRole(role);
//        employeeRole.setEmployee(employee);
//        final EmployeeRole savedEmployeeRole = employeeRoleRepository.save(employeeRole);
//        return savedEmployeeRole;
//    }

//    @Override
//    public ResponseEntity<EmployeeRole> getById(Long id) {
//        Optional<EmployeeRole> employeeRole = employeeRoleRepository.findById(id);
//        if(employeeRole.isEmpty()){
//            return new ResponseEntity<>(new EmployeeRole(), HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(employeeRole.get(), HttpStatus.OK);
//    }
//
//    @Override
//    public List<EmployeeRole> getAll() {
//        return employeeRoleRepository.findAll();
//    }
//
//    @Override
//    public void delete(EmployeeRole employeeRole) {
//        employeeRoleRepository.delete(employeeRole);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        employeeRoleRepository.deleteById(id);
//    }
}
