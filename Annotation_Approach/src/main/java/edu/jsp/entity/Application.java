package edu.jsp.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
 public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Sample s1 = (Sample) context.getBean("getSampleObject");
	System.out.println(s1);
	System.out.println("-----------------------------------------------------");
	Sample s2 = (Sample) context.getBean("s2");
	System.out.println(s2);
	
	
}
}
