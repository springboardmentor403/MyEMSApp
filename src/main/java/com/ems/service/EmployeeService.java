package com.ems.service;

import org.springframework.stereotype.Service;

import com.ems.model.Employee;

@Service
public class EmployeeService {
	
	public Employee addEmployee(Employee eobj) {
		eobj.setId(123);
		return eobj;
	}
	
	public Employee viewById(int empId)
	{
		Employee e=new Employee();
		return e;
	}

}
