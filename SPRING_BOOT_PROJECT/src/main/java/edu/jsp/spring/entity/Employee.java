package edu.jsp.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
  public Employee() {
	  System.out.println("Employee object created....");
  }
  
  @Value("101")
  private int id;
  
  private Address addr;

@Override
public String toString() {
	return "Employee [id=" + id + "Address: "+addr+ "]";
}
  
  
}
