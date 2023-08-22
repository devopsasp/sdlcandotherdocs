package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/employees")
	public ArrayList<Employee> getEmployeeS()
	{
		return service.getEmployeeList();
	}

	
	@PostMapping("/addemployee")
	public void addEmployee(@RequestBody Employee e)
	{
		service.addEmployee(e);
	}
	
	@PatchMapping("/updateemployee")
	public void updateEmployee(@RequestBody Employee e)
	{
		service.updateEmployee(e);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		service.deleteEmployee(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
