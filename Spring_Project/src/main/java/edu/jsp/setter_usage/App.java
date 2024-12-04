package edu.jsp.setter_usage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
   public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("/edu/jsp/setter_usage/Setter.xml");
	Employee employee=context.getBean(Employee.class);
	System.out.println(employee);
}
}
