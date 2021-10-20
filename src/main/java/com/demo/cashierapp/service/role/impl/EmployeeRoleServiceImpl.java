package com.demo.cashierapp.service.role.impl;

import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.helper.employee.MapToEmployeeEntity;
import com.demo.cashierapp.helper.employee.MapToEmployeeRoleSM;
import com.demo.cashierapp.helper.employee.MapToRoleEntity;
import com.demo.cashierapp.model.service.employeeRole.EmployeeRoleSM;
import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;
import com.demo.cashierapp.model.service.role.RoleSM;
import com.demo.cashierapp.repository.EmployeeRoleRepository;
import com.demo.cashierapp.service.employee.EmployeeService;
import com.demo.cashierapp.service.role.EmployeeRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeRoleServiceImpl implements EmployeeRoleService {
    private final EmployeeRoleRepository employeeRoleRepository;
    private final EmployeeService employeeService;

    @Override
    public EmployeeRoleSM assign(String username, RoleSM roleSM) {
        final EmployeeDetailsSM model = employeeService.getEmployeeByUsername(username);
        final EmployeeRole employeeRole = new EmployeeRole();
        employeeRole.setEmployee(new MapToEmployeeEntity().from(model));
        employeeRole.setRole(new MapToRoleEntity().from(roleSM));

        final EmployeeRoleSM savedEmployeeRole = new MapToEmployeeRoleSM().from(employeeRoleRepository.save(employeeRole));
        return savedEmployeeRole;
    }

//    @Override
//    public EmployeeRole create(Employee employee, RoleSM role) {
//        final EmployeeRole employeeRole = new EmployeeRole();
//        employeeRole.setRole(role);
//        employeeRole.setEmployee(employee);
//        final EmployeeRole savedEmployeeRole = employeeRoleRepository.create(employeeRole);
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
