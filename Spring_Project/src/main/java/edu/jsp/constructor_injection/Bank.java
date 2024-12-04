package edu.jsp.constructor_injection;

public class Bank {
 private int acNo;
 private String acHolderName;

 private String branch;
 private long mobile;

public Bank(int acNo, String acHolderName, String branch, long mobile) {
	super();
	this.acNo = acNo;
	this.acHolderName = acHolderName;

	this.branch = branch;
	this.mobile = mobile;
	
}
@Override
public String toString() {
	return "Bank [acNo=" + acNo + ", acHolderName=" + acHolderName + ", branch=" + branch
			+ ", mobile=" + mobile;
}
 
}
