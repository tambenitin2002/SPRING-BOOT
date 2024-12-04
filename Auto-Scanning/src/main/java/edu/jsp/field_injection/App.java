package edu.jsp.field_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(field_injection_config.class);
//	Student s1=context.getBean(Student.class);
//	System.out.println(s1);
	
	Employee e1=context.getBean(Employee.class);
	
	System.out.println(e1);
	
    Product p1=context.getBean(Product.class);
	
	System.out.println(p1);
}
}
