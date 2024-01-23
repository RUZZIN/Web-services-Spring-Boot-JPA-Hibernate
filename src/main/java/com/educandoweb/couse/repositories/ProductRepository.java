package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.couse.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
