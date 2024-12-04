package com.jsp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.jsp.rest.entity.Product;
import com.jsp.rest.service.ProductService;

@RestController
@RequestMapping("/api/v2")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	// create an api - to add product 
	// insertData - use postMapping
	// URI -nouns 
	// @requestBody - take users data in JSON format
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	
	// create an api - to fetch the data from db
	// fetchData - getMapping
	// localhost:8080/api/v2/products/1
	@GetMapping("products/{id}")
	public Product getproductByID(@PathVariable ("id") int id) {
		return productService.getProductById(1);
	}
    
	
	// craete an api - to fetch all the data from db
	// localhost:8080/api/v2/products
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}
	
	// create an api - to remove by id
	// to delete - @deleteMapping
	@DeleteMapping("/products/{id}")
	public int removeProductById(@PathVariable("id") int id) {
		return productService.removeProductById(id);
	}
	
	//create an api- to update by id
	@PutMapping("/products/{id}")
	public Product modifyProduct(@PathVariable("id") int id,
	                             @RequestBody Product product){
		return productService.modifyProductById(id, product);
	                            	 
	                             }
	
	
}

