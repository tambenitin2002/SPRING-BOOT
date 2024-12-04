package edu.jsp.autowire;

public class Dev {
  private Computer com;

public Dev() {
	System.out.println("Dev Constructor 3");
}

public Computer getCom() {
	return com;
}

public void setCom(Computer com) {
	this.com = com;
}

public void build() {
	System.out.println("working on awesome project 4");
	com.compile();  
}
  
}
