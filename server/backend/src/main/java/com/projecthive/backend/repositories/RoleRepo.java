package com.projecthive.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecthive.backend.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}	
