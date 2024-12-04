package edu.jsp.setter_injection;

public class Student {
  private int rollNo;
  private String Name;
  private long mobile;
  private String Email;
  private ClassRoom classroom;
  
public Student() {
	super();
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public ClassRoom getClassroom() {
	return classroom;
}

public void setClassroom(ClassRoom classroom) {
	this.classroom = classroom;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", Name=" + Name + ", mobile=" + mobile + ", Email=" + Email + ", classroom="
			+ classroom + "]";
}
  
}
