package edu.jsp.autowire;

public class Desktop implements Computer{
    public Desktop() {
    	System.out.println("Desktop Constructor 5");
    }
    public void compile() {
    	System.out.println("Compiling in desktop 6");
    }
}
