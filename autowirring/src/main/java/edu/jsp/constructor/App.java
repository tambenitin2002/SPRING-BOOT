package edu.jsp.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("edu/jsp/constructor/constructor.xml");

        // Retrieve the ClassRoom bean and trigger bean initialization
        ClassRoom classroom = context.getBean("c1", ClassRoom.class);
    }
}
