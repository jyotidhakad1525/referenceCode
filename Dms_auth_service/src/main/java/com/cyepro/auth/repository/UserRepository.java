package com.cyepro.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyepro.auth.model.DMSEmployee;

@Repository
public interface UserRepository extends JpaRepository<DMSEmployee, Long> {
  Optional<DMSEmployee> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
