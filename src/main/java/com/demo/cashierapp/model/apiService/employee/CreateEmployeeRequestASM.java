package com.demo.cashierapp.model.apiService.employee;

import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.BaseEmployee;
import com.demo.cashierapp.model.apiService.role.RoleASM;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateEmployeeRequestASM extends BaseEmployee {
    private String password;
    private List<RoleASM> roleASMList;
}
