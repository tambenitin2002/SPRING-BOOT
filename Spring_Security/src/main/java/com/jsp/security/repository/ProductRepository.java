package com.jsp.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.security.entity.Product;



public interface ProductRepository extends JpaRepository<Product, Integer> {

}
