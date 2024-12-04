package edu.jsp.initialization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Construction_injection_config {

	public Construction_injection_config() {
		System.out.println("Configuration constructor object created");
	}
	
	@Bean(name="e1")
	public Employee getEmp() {
		System.out.println("Method Executed");
		Employee emp=new Employee(1,"Nitin",4556);
		return emp;
	}
   
	
}
