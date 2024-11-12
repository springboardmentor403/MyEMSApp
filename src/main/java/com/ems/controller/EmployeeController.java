package com.ems.controller;

import com.ems.model.*;
import com.ems.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
//	@GetMapping("/welcome")
//	public String printMessage() {
//		String msg="Welcome to spring world";
//		return msg;
//	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> printMessage() {
		String msg="Welcome to spring worlddd";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	//add employee
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		//invoke servive 
//		Employee e=employee;
		Employee e=service.addEmployee(employee);
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
	
	@GetMapping("/viewById/{empId}")
    public ResponseEntity<Employee> viewById(@PathVariable int empId){
    	Employee e=service.viewById(empId);
		return new ResponseEntity<>(e,HttpStatus.OK);
    }

}
