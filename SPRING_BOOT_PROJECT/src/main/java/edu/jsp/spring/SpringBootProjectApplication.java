package edu.jsp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.jsp.spring.entity.Employee;
//Auto-configuration
@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(SpringBootProjectApplication.class, args);
		Employee e1=context.getBean("employee", Employee.class);
		System.out.println(e1);
	}

}
