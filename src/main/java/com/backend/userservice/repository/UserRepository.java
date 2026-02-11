package com.backend.userservice.repository;

import com.backend.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // No code needed now – CRUD methods are auto-provided
}