package com.felleuch.daotest.mybatis.dto;

import com.felleuch.daotest.mybatis.model.Role;
import com.felleuch.daotest.mybatis.model.RoleEmployee;

/**
 * Created by felleuch on 11/07/2016.
 */
public class RoleEmployeeDTO extends RoleEmployee {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
