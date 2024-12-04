package com.jsp.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.rest.entity.Product;
import com.jsp.rest.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
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
