package edu.jsp.entity1;

public class Product {
   private int productId;
   private String name;
   private Address addr;
public Product(int productId, String name, Address addr) {
	super();
	this.productId = productId;
	this.name = name;
	this.addr = addr;
}



@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", addr=" + addr + "]";
}
   
}
