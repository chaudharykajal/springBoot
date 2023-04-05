package com.sbjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbjpa.model.Employee;


@Repository


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByEmploc(String emploc);
	
	

}
