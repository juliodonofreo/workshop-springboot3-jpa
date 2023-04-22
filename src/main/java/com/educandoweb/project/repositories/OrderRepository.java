package com.educandoweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
