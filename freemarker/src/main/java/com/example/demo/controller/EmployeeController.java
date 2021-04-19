package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/")
	public String index() {
		return "index"; 
	}
	
	@GetMapping("/showEmployees")
	 	public ModelAndView showEmployees (Model model) {
		List <Employee> employees = this.employeeRepository.findAll();
		Map<String,Object> params = new HashMap<>();
		params.put("employees", employees);
		return new ModelAndView("showEmployees",params);
		
		
	}
}
