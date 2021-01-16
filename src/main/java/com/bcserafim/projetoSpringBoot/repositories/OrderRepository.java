package com.bcserafim.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcserafim.projetoSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
