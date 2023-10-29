package com.projecthive.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projecthive.backend.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
