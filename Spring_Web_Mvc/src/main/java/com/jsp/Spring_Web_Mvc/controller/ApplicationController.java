package com.jsp.Spring_Web_Mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.Spring_Web_Mvc.entity.Student;

@Controller
@RequestMapping("/app")
public class ApplicationController {

	//localhost:8080/app/execute
	@RequestMapping("/execute")
	public void execute() {
		System.out.println("Execute method from Application controller class ... ");
		
	}
	
	//localhost:8080/app/print
	@RequestMapping("/print")
	//to print output on browser
	@ResponseBody
	public String printMessage() {
		System.out.println("Print message executed ...");
		return "<h1>This is output of printMessage method </h1>";
	}
	
	
	@RequestMapping("/student")
	@ResponseBody
	public Student printStudentDetails() {
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Nitin");
		s1.setParcentage(90.90);
		return s1;
	}
	
	//URL Parameter - Key = value pair (to take input from user
	//localhost:8080/app/add?n1=10&n2=20
	//to fetch data from url- @RequestParam
	@RequestMapping("/add")
	@ResponseBody
	public String addition(@RequestParam("n1") int num1,
			@RequestParam("n2") int num2) {
		return num1+" + " +num2 + "  = " + (num1+num2);
	}
	
	
	
	@RequestMapping("/details")
	@ResponseBody
	public Student addition(@RequestParam("roll") int roll,
			@RequestParam("name") String name,
			@RequestParam("per") double percentage) {
		Student s2=new Student() ;
			s2.setRollno(roll);
			s2.setName(name);
			s2.setParcentage(percentage);
			
			return s2;
			
		
	}
	
	//path variable - working with hyperlink
	//localhost:8080/app/subtraction/20/10
	@RequestMapping("/subtraction/{num1}/{num2}")
	@ResponseBody
	public String subtraction(@PathVariable("num1")int n1,
			@PathVariable("num2") int n2) {
		return n1+"-"+n2+"="+(n1-n2);
	}
}
