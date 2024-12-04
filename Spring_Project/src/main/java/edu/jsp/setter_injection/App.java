package edu.jsp.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext();
		Student student=context.getBean(Student.class);
		System.out.println(student);
	}

}
