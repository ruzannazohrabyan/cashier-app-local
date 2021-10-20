package com.demo.cashierapp.model.apiService.employeeRole;

import com.demo.cashierapp.model.apiService.employee.EmployeeDetailsASM;
import com.demo.cashierapp.model.apiService.role.RoleASM;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeRoleASM {
    private EmployeeDetailsASM employeeDetailsASM;
    private RoleASM roleASM;
}
