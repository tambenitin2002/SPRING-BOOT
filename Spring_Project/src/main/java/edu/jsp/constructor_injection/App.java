package edu.jsp.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/edu/jsp/constructor_injection/Customer.xml");
		Customer customer=context.getBean(Customer.class);
		System.out.println(customer);

	}

}
