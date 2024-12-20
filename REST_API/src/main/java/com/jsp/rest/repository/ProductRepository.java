package com.jsp.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
