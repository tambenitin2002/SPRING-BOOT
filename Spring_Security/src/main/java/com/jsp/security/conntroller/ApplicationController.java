package com.jsp.security.conntroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// to create rest_Api  
@RestController  // perfrom operation of @controller & @responsebody
@RequestMapping("/api/v1")
public class ApplicationController {
	
	@GetMapping("/message1")
	public String message1() {
		return "this is the first api";
	}

}
