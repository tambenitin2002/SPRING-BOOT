package edu.jsp.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.byType.Demo;
import edu.jsp.byType.Sample;



public class Application {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/edu/jsp/byName/Customer.xml");
	    Demo sample=context.getBean("demo",Demo.class);
	}

}
