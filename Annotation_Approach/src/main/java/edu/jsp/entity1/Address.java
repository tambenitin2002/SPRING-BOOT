package edu.jsp.entity1;

public class Address {
  private int id;
  private String city;
  private int pincode;
public Address(int id, String city, int pincode) {
	super();
	this.id = id;
	this.city = city;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
}
  
}
