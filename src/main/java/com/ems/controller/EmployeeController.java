package com.ems.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Employee;
import com.ems.service.*;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;//=new EmployeeService();
//	@GetMapping("/welcome")
//	public String printMessage() {
//		String msg="Welcome to spring world";
//		return msg;
//	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> printMessage() {
//		EmployeeService service=new EmployeeService();
		String msg="Welcome to spring worldddd";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee eobj) {
//		eobj.setId(123);
//		EmployeeService service=new EmployeeService();
		Employee empObj=service.addEmployee(eobj);
		return new ResponseEntity<>(empObj,HttpStatus.OK);
		
	}
	
	@GetMapping("/viewAll")
	public ResponseEntity<List<Employee>> viewAll(){
		
		List<Employee> eList=service.viewAllEmployee();
		return new ResponseEntity<>(eList,HttpStatus.OK);
	}

	
	@GetMapping("/viewById/{empId}")
	public ResponseEntity<Employee> viewById(@PathVariable int empId) {
		return new ResponseEntity<>(service.viewById(empId),HttpStatus.OK);
		
	}
	
	
	@PutMapping("/updateDesignation/{empId}/{newDesignation}")
	public ResponseEntity<Employee> updateDesignation(@PathVariable int empId, @PathVariable String newDesignation){
		return new ResponseEntity<>(service.updateDesignation(empId, newDesignation),HttpStatus.OK);
	}
	
	@GetMapping("/viewByDesignation/{designation}")
	public ResponseEntity<List<Employee>> viewByDesignation(@PathVariable String designation) {
		return new ResponseEntity<>(service.viewByDesignation(designation),HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/viewByDesignation/{designation}")
//	public ResponseEntity<List<Employee>> findByDesignation(@PathVariable String designation){
//		return new ResponseEntity<>(service.findByDesignation(designation),HttpStatus.OK);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/viewAll")
//	public ResponseEntity<List<Employee>> viewAll() {
//
//		return new ResponseEntity<>(service.viewAll(),HttpStatus.OK);
//	}
//	
//	@GetMapping("/viewById/{empId}")
//	public ResponseEntity<Employee> viewById(@PathVariable int empId){
//		return new ResponseEntity<>(service.viewById(empId),HttpStatus.OK);
//	}
//	
	
	
	
	
//	@GetMapping("/findNoofEmp")
//	public int findNoEmp() {
//		return 56;
//	}
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/welcome")
//	public ResponseEntity<String> printMessage() {
//		String msg="Welcome to spring worlddd";
//		return new ResponseEntity<>(msg,HttpStatus.OK);
//	}
//	
//	//add employee
//	@PostMapping("/addEmployee")
//	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//		//invoke servive 
////		Employee e=employee;
//		Employee e=service.addEmployee(employee);
//		return new ResponseEntity<>(e,HttpStatus.OK);
//	}
//	
//	@GetMapping("/viewById/{empId}")
//    public ResponseEntity<Employee> viewById(@PathVariable int empId){
//    	Employee e=service.viewById(empId);
//		return new ResponseEntity<>(e,HttpStatus.OK);
//    }

}
