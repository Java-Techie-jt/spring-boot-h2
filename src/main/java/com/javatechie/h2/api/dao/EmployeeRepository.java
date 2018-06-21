package com.javatechie.h2.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.h2.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByDept(String dept);

}
