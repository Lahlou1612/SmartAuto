package com.smart.auto.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.smart.auto.entites.User;
 
 
@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
