package com.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.model.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

}
