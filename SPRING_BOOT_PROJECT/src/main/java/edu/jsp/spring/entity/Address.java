package edu.jsp.spring.entity;

import org.springframework.beans.factory.annotation.Value;

public class Address {
private int id;
private String city;
private int pin;
public Address(@Value("1") int id,@Value("pune") String city,@Value("414402") int pin) {
	super();
	this.id = id;
	this.city = city;
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", pin=" + pin + "]";
}

}
