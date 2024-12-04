package edu.jsp.entity1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		   ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		   Product p1=(Product)context.getBean("getProduct");
		   System.out.println(p1);
	}

   
}
