package edu.jsp.constructor_usage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("edu/jsp/constructor_usage/ClassRoom.xml");
		ClassRoom classroom=context.getBean("c1",ClassRoom.class);
		System.out.println(classroom);

	}

}
