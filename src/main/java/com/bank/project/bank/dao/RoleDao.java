package com.bank.project.bank.dao;

import com.bank.project.bank.model.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
    Optional<Role> getByRoleName(Role.RoleName roleName);
}
