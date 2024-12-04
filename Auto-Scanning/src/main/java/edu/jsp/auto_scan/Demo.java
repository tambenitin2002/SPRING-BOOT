package edu.jsp.auto_scan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//by create object 
//by default object id is same aa a class name- lowercase
//modify id of an object
@Component("d1")
@Scope("prototype")
public class Demo {

	public Demo() {
		System.out.println("Demo class object created");
		System.out.println("-------------------------------------------------");
	}
    
}
