package com.nothingbehind.spring.sample.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nothingbehind.spring.sample.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Override
	List<Employee> findAll();
	
	@Override
	Employee getById(Integer id);
}
