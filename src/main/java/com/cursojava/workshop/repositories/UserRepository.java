package com.cursojava.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
