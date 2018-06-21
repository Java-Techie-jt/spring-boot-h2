package com.javatechie.h2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.h2.api.dao.EmployeeRepository;
import com.javatechie.h2.api.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee saved..";
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		return repository.findAll();
	}

	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeesByDept(@PathVariable String dept) {
		return repository.findByDept(dept);
	}

}
