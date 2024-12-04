package org.jsp.springProgram2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/springProgram2/Sample.xml");
		Demo d3=context.getBean("demo", Demo.class);

	}

}
