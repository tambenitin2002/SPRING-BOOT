package edu.jsp.Annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.jsp.Annotation.EmployeeService")
public class AppConfig {
}

