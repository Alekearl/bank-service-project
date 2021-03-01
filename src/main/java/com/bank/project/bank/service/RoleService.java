package com.bank.project.bank.service;

import com.bank.project.bank.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByRoleName(String name);
}
