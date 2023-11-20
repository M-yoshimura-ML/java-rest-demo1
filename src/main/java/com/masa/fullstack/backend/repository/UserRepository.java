package com.masa.fullstack.backend.repository;

import com.masa.fullstack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
