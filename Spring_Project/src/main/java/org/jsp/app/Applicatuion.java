package org.jsp.app;

import org.jsp.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applicatuion {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/entity/Sample.xml");
		Employee emp=(Employee)context.getBean("emp");
		
		
	}

}
