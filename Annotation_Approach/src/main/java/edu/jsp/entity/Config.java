package edu.jsp.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
//Represent class as Configuration - Replacement  of xml file
@Configuration
public class Config {
   public Config() {
	   System.out.println("Config class constructor...");
   }
   
   //object of Sample class - replacement of bean tag
   //by default object id is same as a method name 
   
   @Bean
   //To modify scope
   @Scope("prototype")
   public Sample getSampleObject() {
	   System.out.println("getSampleObject() called bye Ioc Container..");
	   Sample s1=new Sample();
	   return s1;
   }
   
   @Bean(name="s2")
   public Sample getSampleObj() {
	   System.out.println("-----------------------------------------------------------");
	   System.out.println("getSampleObje() called by Ioc container....");
	   return new Sample();
   }
}
