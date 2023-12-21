package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.couse.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
