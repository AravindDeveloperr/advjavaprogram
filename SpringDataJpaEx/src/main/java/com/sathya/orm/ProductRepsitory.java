package com.sathya.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface ProductRepsitory extends JpaRepository<Product, Integer>{

	
}
