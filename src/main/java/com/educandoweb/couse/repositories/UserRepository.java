package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.couse.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
