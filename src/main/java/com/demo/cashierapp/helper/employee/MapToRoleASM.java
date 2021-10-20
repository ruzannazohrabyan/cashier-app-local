package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.model.apiService.role.RoleASM;
import com.demo.cashierapp.model.service.role.RoleSM;

public class MapToRoleASM {
    public RoleASM from(RoleSM roleSM) {
        RoleASM model = new RoleASM();
        model.setRoleName(roleSM.getRoleName());
        return model;
    }
}
