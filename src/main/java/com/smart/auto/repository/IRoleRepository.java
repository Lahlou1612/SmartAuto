package com.smart.auto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.auto.entites.Role;
import com.smart.auto.entites.RoleName;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(RoleName roleName);
}
