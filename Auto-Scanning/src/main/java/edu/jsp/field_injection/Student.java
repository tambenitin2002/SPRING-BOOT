package edu.jsp.field_injection;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	//@Value("101")
   private int id;
  // @Value("Nitin")
   private String name ;
  // @Value("65.12")
   private double percentage;
   
   
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getPercentage() {
	return percentage;
}


public void setPercentage(double percentage) {
	this.percentage = percentage;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
}
   
   
}
