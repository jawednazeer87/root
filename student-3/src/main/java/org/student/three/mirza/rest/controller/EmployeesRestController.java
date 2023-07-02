package org.student.three.mirza.rest.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.student.three.mirza.modal.Employees;
import org.student.three.mirzaa.service.EmployeesService;


@RestController                           // restctorller annotation indicate as rest class 
@RequestMapping("/employees")
public class EmployeesRestController {

	@Autowired
	private  EmployeesService employeesService;
	
	List<Employees> employeesList = new ArrayList<>();
		
	@DeleteMapping("/delete-by-id/{id}")
	public void deleteById(@PathVariable long id) {
		employeesService.deleteById(id); 
	}
	
	@PutMapping("/update-employee-name-by-employeeNum/{employeeNum}")
	public Employees updateByEmployeeNum(@PathVariable String employeeNum, @RequestParam String employeeName) {
		return employeesService.updateByEmployeeNum(employeeNum, employeeName);
	}
	
	@GetMapping("/find_by_employee-num/{employeesNum}")
	public Employees findByEmployeeNum(@PathVariable String employeeNum) {
		return employeesService.findByEmployeesNum(employeeNum);
	}
	
	@GetMapping("/find-by-employees-name")
	List<Employees> findByEmployeeName(@RequestParam String employeeName) {
		return employeesService.findByEmployeeName(employeeName);
	}
	
	@PostMapping("/add")
	public Employees add(@RequestBody Employees employees) {
		System.out.println(employees);
	employeesList.add(employees);
		return employees;
	}
	
	@PostMapping("/create")
	public Employees create(@RequestBody Employees employees) {
		return employeesService.create(employees);
	}
	
	@GetMapping("/get/all")               
	public List<Employees> getAll() {
		return employeesService.getAll();
	}
	
	@GetMapping("/get")
	public List<Employees> get() {
		return employeesList;
	}
	
	@GetMapping("/get/{id}")
	public Employees findId(@PathVariable int id) {
		List<Employees> collect = employeesList.stream().filter(employees -> employees.getId()==id).collect(Collectors.toList());
		return collect.get(0);
	}
}



