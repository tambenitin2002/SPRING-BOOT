package edu.jsp.studentdata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("edu/jsp/studentdata/Student.xml");
		
		Student stud=context.getBean("stud",Student.class);
		System.out.println(stud);
		System.out.println("--------------------------------------------------");
		Student stud2=context.getBean("stud2",Student.class);
		System.out.println(stud2);

	}

}
