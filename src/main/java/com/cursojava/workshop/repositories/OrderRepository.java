package com.cursojava.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
