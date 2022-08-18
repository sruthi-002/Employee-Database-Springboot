package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import java.util.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	@PostMapping("/add")
	public Employee addemployee(@RequestBody Employee employee)
	{
		return employeeservice.addemployee(employee);
	}
	@PostMapping("/addemployees")
	public List<Employee> addemployees(@RequestBody List<Employee> employees)
	{
		return employeeservice.addemployees(employees);
	}
	@PutMapping("/updateMapping")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeservice.updateEmployee(employee);
	}
	@DeleteMapping("/deleteemployee/{Name}")
	public boolean deleteemployee(@PathVariable int Id)
	{
		return employeeservice.deleteemployee(Id);
	}
}
