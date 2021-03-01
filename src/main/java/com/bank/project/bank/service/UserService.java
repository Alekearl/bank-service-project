package com.bank.project.bank.service;

import com.bank.project.bank.model.User;

public interface UserService {
    User create(User user);

    User update(User user);

    User get(Long id);

    User findByPhoneNumber(String phoneNumber);

    void delete(Long id);
}
