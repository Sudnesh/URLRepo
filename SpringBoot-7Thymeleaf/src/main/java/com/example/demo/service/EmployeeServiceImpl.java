package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}
	
	@Override
	public List<Employee> getAllEmployeeByName(String name) {
		return dao.getUsingEmpName(name);
	}
	
	@Override
	public List<Employee> getAllEmployeeBySalary(float lower, float higher) {
		return dao.getEmployeeBySalaray(lower, higher);
	}

	@Override
	public Employee getEmployeesWithId(int empId) {
		return dao.getById(empId);
	}

	@Override
	public Employee addEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		return dao.save(emp);
	}

	@Override
	public void deleteEmployee(int empId) {
		dao.deleteById(empId);
	}

}
