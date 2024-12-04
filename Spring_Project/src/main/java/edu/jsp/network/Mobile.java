package edu.jsp.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile {
	// Dependency
	/*
	 * By default byType autowiring will get performed by IOC container.
	 * If ther are multiple objects then , becausem of @Qualifier annotation 
	 * IOC container will perform byName autowiring
	 */
	   
	@Autowired
	//to remove confusion between multiple object for a dependency
	@Qualifier("jio")
   private Simcard sim;
     
   public void mobileNetwork() {
	   sim.network();
   }
}
