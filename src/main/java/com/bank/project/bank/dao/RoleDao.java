package com.bank.project.bank.dao;

import com.bank.project.bank.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleDao extends JpaRepository<Role, Long> {
    Optional<Role> getByRoleName(String roleName);
}
