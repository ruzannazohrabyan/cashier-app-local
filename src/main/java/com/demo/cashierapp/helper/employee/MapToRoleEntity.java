package com.demo.cashierapp.helper.employee;

import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.service.role.RoleSM;

public class MapToRoleEntity {

    public Role from(RoleSM roleSM) {
        Role role = Role.valueOf(roleSM.getRoleName());
        return role;
    }
}
