package edu.jsp.initialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(Construction_injection_config.class);
     Employee e1=(Employee) context.getBean("e1");
     System.out.println(e1);
  }
}
