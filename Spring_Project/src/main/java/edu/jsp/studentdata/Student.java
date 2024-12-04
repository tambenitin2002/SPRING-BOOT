package edu.jsp.studentdata;

public class Student {
private int rollNo;
private String fullName ;
private double percentage;
private String degree;

// 
public Student(int rollNo, String fullName, double percentage) {
	super();
	this.rollNo = rollNo;
	this.fullName = fullName;
	this.percentage = percentage;
}

//
public Student(int rollNo, String fullName, double percentage, String degree) {
	super();
	this.rollNo = rollNo;
	this.fullName = fullName;
	this.percentage = percentage;
	this.degree = degree;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", percentage=" + percentage + ", degree=" + degree
			+ "]";
}



}
