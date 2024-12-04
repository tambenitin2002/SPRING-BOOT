package com.jsp.Spring_Web_Mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.Spring_Web_Mvc.entity.Employee;
import com.jsp.Spring_Web_Mvc.entity.Student;

@Controller
@RequestMapping("/home")
public class HomeConntroller {
	//toDisplay html file
	//localhost:8080/home/demo
	@RequestMapping("/demo")
	public String showDemoFile() {
		return "/demo.html";
	}

	@RequestMapping("/student")
	@ResponseBody
	public Student displayStudentDetails(Student s1) {
		return s1;
	}
	
	@RequestMapping("/sample")
	public String displaySample() {
		return "/Sample.jsp";
	}
	
	
    @RequestMapping("/data")
    public String transferData(org.springframework.ui.Model model) { // Corrected spelling from "tranferData" to "transferData"
        
        int a = 20;
        List<String> subjects = List.of("HTML", "CSS");
        model.addAttribute("number", a);
        model.addAttribute("listOfSubject", subjects);
        
        return "/Sample.jsp"; // Corrected the return path
    }

    // Show the form page
    @RequestMapping("/employeeForm")
    public String showEmployeeForm() {
        return "/form.html";
    }

    // Handle form submission and redirect to the display page
    @RequestMapping("/submitForm")
    public String submitEmployeeForm(Employee employee, Model model) {
        model.addAttribute("empId", employee.getEmpId());
        model.addAttribute("ename", employee.getEname());
        model.addAttribute("salary", employee.getSalary());
        model.addAttribute("email", employee.getEmail());
        model.addAttribute("mobile", employee.getMobile());
        model.addAttribute("dateOfJoining", employee.getDate());

        return "/displayEmployee.jsp";
    }
}
