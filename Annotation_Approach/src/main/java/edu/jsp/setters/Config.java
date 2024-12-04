package edu.jsp.setters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	public Config() {
	
	}
	
	@Bean(name="s1")
	public Student getStudent() {
		System.out.println("method Executed ");
		Student stud=new Student();
		stud.setRollNo(101);
		stud.setName("Name");
		stud.setContact(1055555551);
		return stud;
	}
 
}
