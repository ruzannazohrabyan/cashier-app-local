package com.demo.cashierapp.model.service.employeeRole;

import com.demo.cashierapp.model.service.employee.EmployeeDetailsSM;
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
    private EmployeeDetailsSM employeeDetailsSM;
    private RoleSM roleSM;
}
