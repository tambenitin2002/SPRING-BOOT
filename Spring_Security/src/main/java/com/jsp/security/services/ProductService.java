package com.jsp.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jsp.security.entity.Product;
import com.jsp.security.repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		//get password form user
		String normalPassword=product.getPassword();
		System.out.println(normalPassword);
		//encrypt password -return -encoded password
		String encodePassword=passwordEncoder.encode(normalPassword);
		
		return productRepository.save(product);
	}
	
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}
	
	public int removeProductById(int id) {
		if(getProductById(id)!= null) {
			productRepository.deleteById(id);
			return 1;
		}
		return 0;
	}
	
	public Product modifyProductById(int id, Product newProduct) {
		Product productFromDb=getProductById(id);
		if(productFromDb!=null) {
			productFromDb.setCategory(newProduct.getCategory());
			productFromDb.setPricePerUnit(newProduct.getPricePerUnit());
			productFromDb.setProductName(newProduct.getProductName());
			productFromDb.setQuantity(newProduct.getQuantity());
			
			return productRepository.save(productFromDb);
		}
		return null;
	}
	
	

}
