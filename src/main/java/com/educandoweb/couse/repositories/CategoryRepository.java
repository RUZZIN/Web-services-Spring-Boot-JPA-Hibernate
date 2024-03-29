package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.couse.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
