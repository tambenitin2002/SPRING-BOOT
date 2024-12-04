package edu.jsp.setters;

public class Student {
  private int rollNo;
  private String name ;
  private long contact;
  
  
  
public Student() {
	
	
	System.out.println("constructor of student with 3 argument");
}



public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}



@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", contact=" + contact + "]";
}



  
  
}
