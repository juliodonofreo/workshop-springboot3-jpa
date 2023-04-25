package com.educandoweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project.entities.OrderItem;
import com.educandoweb.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
