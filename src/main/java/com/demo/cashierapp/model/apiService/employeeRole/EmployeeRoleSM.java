package com.demo.cashierapp.model.apiService.employeeRole;

import com.demo.cashierapp.model.service.employee.EmployeesDetailsSM;
import com.demo.cashierapp.model.service.role.RoleSM;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeRoleSM {
    private EmployeesDetailsSM employeesDetailsSM;
    private RoleSM roleSM;
}
