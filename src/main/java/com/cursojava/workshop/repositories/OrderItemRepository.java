package com.cursojava.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
