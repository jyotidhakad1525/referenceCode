package com.cyepro.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyepro.auth.model.DMSRole;

@Repository
public interface RoleRepository extends JpaRepository<DMSRole, Long> {
  Optional<DMSRole> findByRoleName(String name);
}
