package com.bcserafim.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.projetoSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
