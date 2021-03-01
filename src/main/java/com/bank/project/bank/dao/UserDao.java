package com.bank.project.bank.dao;

import com.bank.project.bank.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserDao extends JpaRepository<User, Long> {
    @Query("FROM User u INNER JOIN FETCH u.roles"
            + " WHERE u.phoneNumber = :phoneNumber")
    Optional<User> findByPhoneNumber(String phoneNumber);

    @Query("FROM User u INNER JOIN FETCH u.roles"
            + " WHERE u.id = :id")
    Optional<User> getById(Long id);
}
