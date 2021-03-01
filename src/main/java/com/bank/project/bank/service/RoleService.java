package com.bank.project.bank.service;

import com.bank.project.bank.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getByRoleName(String name);
}
