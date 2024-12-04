package edu.jsp.constructor_injection;

public class Address {
  private String city;
  private String area;
  private int pincode;


public Address(String city, String area, int pincode) {
	super();
	this.city = city;
	this.area = area;
	this.pincode = pincode;
}


@Override
public String toString() {
	return "Address [city=" + city + ", area=" + area + ", pincode=" + pincode + "]";
}
  
  
  
}
