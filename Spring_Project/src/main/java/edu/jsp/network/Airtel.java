package edu.jsp.network;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Simcard {

	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("Network of Airtel....");
		
	}
       
}
