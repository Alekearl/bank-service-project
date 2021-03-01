package com.bank.project.bank.service.serviceimpl;

import com.bank.project.bank.dao.RoleDao;
import com.bank.project.bank.exception.DataProcessingException;
import com.bank.project.bank.model.Role;
import com.bank.project.bank.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.save(role);
    }

    @Override
    public Role getByRoleName(String name) {
        return roleDao.getByRoleName(name)
                .orElseThrow(() -> new DataProcessingException("Can't get role by name " + name));
    }
}
