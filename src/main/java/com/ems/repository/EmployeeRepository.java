package com.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {
	public List<Employee> findByDesignation(String designation);
}
