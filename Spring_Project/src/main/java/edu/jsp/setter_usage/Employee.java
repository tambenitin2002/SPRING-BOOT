package edu.jsp.setter_usage;

public class Employee {

	 private int empId;
	 private String name;
	 private double salary;
	 
	 
	public Employee() {
		super();
		System.out.println("Employee class No-Argument constructor...");
	}
	public int getEmpId() {
		return empId;
		
	}
	public void setEmpId(int empId) {
		this.empId = empId;
		System.out.println("This is empId");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("This is name");
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		System.out.println("This is salary");
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	 
	 
}
