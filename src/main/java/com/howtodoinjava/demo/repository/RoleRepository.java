package com.howtodoinjava.demo.repository;

import com.howtodoinjava.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
