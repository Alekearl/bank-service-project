package com.bank.project.bank.service;

import com.bank.project.bank.model.User;

public interface UserService {
    User save(User user);

    User findByPhoneNumber(String phoneNumber);

    User getById(Long id);

    void delete(Long id);
}
