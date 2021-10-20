package com.demo.cashierapp.service.role;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.service.role.RoleSM;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface EmployeeRoleService {
    EmployeeRole assign(String username, RoleSM roleSM);

//    ResponseEntity<EmployeeRole> getById(Long id);
//
//    List<EmployeeRole> getAll();
//
//    void delete(EmployeeRole employeeRole);
//
//    void deleteById(Long id);

}
