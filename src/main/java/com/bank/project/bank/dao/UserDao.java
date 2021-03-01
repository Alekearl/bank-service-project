package com.bank.project.bank.dao;

import com.bank.project.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserDao extends JpaRepository<User, Long> {

    Optional<User> findByPhoneNumber(String phoneNumber);
}
