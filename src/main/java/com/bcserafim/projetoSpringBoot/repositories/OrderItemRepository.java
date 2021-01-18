package com.bcserafim.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.projetoSpringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
