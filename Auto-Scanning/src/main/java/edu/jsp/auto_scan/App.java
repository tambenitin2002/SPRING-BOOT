package edu.jsp.auto_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		String [] arr=context.getBeanDefinitionNames();
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("---------------------------------------------------------");
		Demo d1=(Demo) context.getBean("d1");
		System.out.println(d1);
		
		System.out.println("---------------------------------------------------------");
		Demo d2=(Demo) context.getBean("d2");
		System.out.println(d2);
		
		System.out.println("---------------------------------------------------------");
		Demo d3=(Demo) context.getBean("d3");
		System.out.println(d3);
	}

}
