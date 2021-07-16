package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployeesWithId(int empId);
	public Employee addEmployee(Employee emp);
	public Employee updateEmployee(int empId, Employee emp);
	public void deleteEmployee(int empId);
	List<Employee> getAllEmployeeByName(String name);
	List<Employee> getAllEmployeeBySalary(float lower, float higher);

}
