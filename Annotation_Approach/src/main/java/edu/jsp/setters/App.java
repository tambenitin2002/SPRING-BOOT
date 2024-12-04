package edu.jsp.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
	ApplicationContext contx=new AnnotationConfigApplicationContext(Config.class);
	Student s1=(Student)contx.getBean("s1");
	System.out.println(s1);
}
}
