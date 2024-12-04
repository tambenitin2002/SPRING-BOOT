package edu.jsp.constructor_injection;

public class Customer {
  private int id;
  private String fullName;
  private long mobile;
  
  // Has-A Relationship
  
  private Address addr;
  private Bank bank;

public Customer(int id, String fullName, long mobile, Address addr, Bank bank) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.mobile = mobile;
	this.addr = addr;
	this.bank=bank;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", fullName=" + fullName + ", mobile=" + mobile + ", addr=" + addr + "]"+ ", bank=" + bank + "]";
}
  
  
}
