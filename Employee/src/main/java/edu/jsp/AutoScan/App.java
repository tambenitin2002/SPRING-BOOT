package edu.jsp.AutoScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.Annotation.AppConfig;


public class App {

	    public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        EmployeeService employeeService = context.getBean(EmployeeService.class);
	        employeeService.operation();
	    }
	
    
}