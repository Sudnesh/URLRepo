package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl service;
	@GetMapping("/employees")
	public String getAllEmployees(Model model) {
		model.addAttribute("emplist",service.getAllEmployees());
		return "ShowAll";
	}
	
	
	
}
