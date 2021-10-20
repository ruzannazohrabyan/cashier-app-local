package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.apiService.role.RoleASM;
import com.demo.cashierapp.model.service.role.RoleSM;

public class MapToRoleSM {

    public RoleSM from(RoleASM roleASM) {
        RoleSM roleSM = new RoleSM();
        roleSM.setRoleName(roleASM.getRoleName());
        return roleSM;
    }

    public RoleSM from(Role role) {
        RoleSM roleSM = new RoleSM();
        roleSM.setRoleName(role.name());
        return roleSM;
    }
}
