package org.jsp.springProgram1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
   public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("org/jsp/springProgram1/Sample.xml");
	Demo d2=context.getBean(Demo.class);
}
}
