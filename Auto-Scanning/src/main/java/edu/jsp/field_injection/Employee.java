package edu.jsp.field_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	
	
	// @Value("101")
	   private int id;
	//   @Value("Nitin")
	   private String name ;
	//   @Value("56296")
	   private double salary;
	   
	   
	public Employee( @Value("101") int id, @Value("Nitin") String name, @Value("56296") double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	 
}
