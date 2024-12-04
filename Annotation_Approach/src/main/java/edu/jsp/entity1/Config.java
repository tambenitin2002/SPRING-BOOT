package edu.jsp.entity1;

import org.springframework.context.annotation.Bean;

public class Config {

	public Config() {
		
	} 
	@Bean 
	public Address getAddress() {
		Address a1=new Address(1,"pune",414402);
		return a1;
	}
	
	@Bean
	public Product  getProduct() {
		Product p1=new Product(1,"Laptop",getAddress());
		return p1;
	}
	
	
   
}
