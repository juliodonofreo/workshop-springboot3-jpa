package com.educandoweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
