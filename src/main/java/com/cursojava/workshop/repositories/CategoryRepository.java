package com.cursojava.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
