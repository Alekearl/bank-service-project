package com.bank.project.bank.dao;

import com.bank.project.bank.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {
    @Query("FROM users u INNER JOIN FETCH u.roles"
            + " WHERE u.phoneNumber = :phoneNumber")
    Optional<User> findByPhoneNumber(String phoneNumber);

    @Query("FROM users u INNER JOIN FETCH u.roles"
            + " WHERE u.id = :id")
    Optional<User> getById(Long id);
}
