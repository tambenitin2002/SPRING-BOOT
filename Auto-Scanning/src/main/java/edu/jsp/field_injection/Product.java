package edu.jsp.field_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
   private int accno;
   private String name;
public int getAccno() {
	return accno;
}
public void setAccno(@Value("12") int accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(@Value("Nitin ")String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Product [accno=" + accno + ", name=" + name + "]";
}
   
}
