package edu.jsp.AutoScan;
public class Employee {
    private int id;
    private String name;

    // Getters, setters, constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString() method to display employee information
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
