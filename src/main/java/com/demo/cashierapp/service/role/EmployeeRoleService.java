package com.demo.cashierapp.service.role;

import com.demo.cashierapp.model.service.employeeRole.EmployeeRoleSM;
import com.demo.cashierapp.model.service.role.RoleSM;


public interface EmployeeRoleService {
    EmployeeRoleSM assign(String username, RoleSM roleSM);

//    ResponseEntity<EmployeeRole> getById(Long id);
//
//    List<EmployeeRole> getAll();
//
//    void delete(EmployeeRole employeeRole);
//
//    void deleteById(Long id);

}
