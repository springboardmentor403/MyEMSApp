package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ems.model.Employee;
import com.ems.model.*;
import com.ems.repository.DepartmentRepository;
import com.ems.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private DepartmentRepository deptRepository;
	
	public Employee addEmployee(Employee eobj) {
		
		Employee addedObj=repository.save(eobj);
		return addedObj;
	}
	
	
	public List<Employee> viewAllEmployee(){
		List<Employee> eList=repository.findAll();
		return eList;
	}
	
	
	public Employee viewById(int empId) {
		Employee eobj=repository.findById(empId).get();
		return eobj;
		
	}
	
	public Employee updateDesignation(int empId,String designation) {
		
		Employee eobj=repository.findById(empId).get();
		eobj.setDesignation(designation);
		repository.save(eobj);
		return eobj;
		
	}
	
	public List<Employee> viewByDesignation(String designation){
		return repository.findByDesignation(designation);
	}
	
	
	public Employee assignDepartment(int eid, int deptId) {
		Employee eobj=repository.findById(eid).get();
		Department dobj=deptRepository.findById(deptId).get();
		if(eobj!=null && dobj!=null) {
			eobj.setDobj(dobj);
			repository.save(eobj);
			return eobj;
			
		}
		else
		{
			return null;
		}
	}
	
	
	
	
//	public List<Employee> findByDesignation(String designation){
//		return respository.findByDesignation(designation);
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public List<Employee> viewAll()
//	{
//		return repository.findAll();
//	}
//	
//	public Employee viewById(int id) {
//		return repository.findById(id).get();
//	}
//	
//	public Employee updateDesignation(int empId, String newDesignation) {
//		Employee e=repository.findById(empId).get();
//		e.setDesignation(newDesignation);
//		repository.dele
//	}

}
