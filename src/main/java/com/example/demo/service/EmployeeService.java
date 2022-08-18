package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository employeerepo;

	public Employee addemployee(Employee employee) {
		return employeerepo.save(employee);
	}

	public List<Employee> addemployees(List<Employee> employees) {
		return employeerepo.saveAll(employees);
	}

	public Employee updateEmployee(Employee employee) {
		Employee emp = employeerepo.findById(employee.getId()).orElse(null);
		if(emp==null)
		{
		     return employeerepo.save(employee);
		}
		else
		{
			employeerepo.deleteById(emp.getId());
			return employeerepo.save(employee);
		}
	}

	public boolean deleteemployee(int Id) {
		Employee emp = employeerepo.getById(Id);
		if(emp!=null)
		{
			employeerepo.deleteById(Id);
			return true;
		}
		return false;	
	}
}
