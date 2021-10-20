package com.demo.cashierapp.model.service.employee;

import com.demo.cashierapp.model.BaseEmployee;
import com.demo.cashierapp.model.service.role.RoleSM;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeesDetailsSM extends BaseEmployee {
    List<RoleSM> roleSMList;
}
