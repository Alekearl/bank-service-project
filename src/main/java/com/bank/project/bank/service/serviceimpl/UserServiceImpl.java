package com.bank.project.bank.service.serviceimpl;

import com.bank.project.bank.dao.UserDao;
import com.bank.project.bank.exception.DataProcessingException;
import com.bank.project.bank.model.User;
import com.bank.project.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findByPhoneNumber(String phoneNumber) {
        return userDao.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new DataProcessingException("Can't get user by phone number"));
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id)
                .orElseThrow(() -> new DataProcessingException("Can't get by user by Id" + id));
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
