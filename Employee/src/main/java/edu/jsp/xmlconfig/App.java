package edu.jsp.xmlconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/edu/jsp/xmlconfig/Config.xml");
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        employeeService.performOperation();
    }
}