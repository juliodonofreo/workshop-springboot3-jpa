package com.educandoweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
