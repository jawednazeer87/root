package org.student.three.naushad.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.student.three.naushad.model.Employee;
import org.student.three.naushad.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@GetMapping("/get-by-id/{id}")
	public Employee getById(@PathVariable long id) {
		return employeeService.getById(id);
	}

	@GetMapping("/get-by-city")
	public List<Employee> getByCity(@RequestParam String city) {
		return employeeService.getByCity(city);
	}

	@GetMapping("/get-by-state")
	public List<Employee> getByState(@RequestParam String state) {
		return employeeService.getByState(state);
	}

	@GetMapping("/get-all")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@PatchMapping("/update-name-by-id/{id}")
	public Employee updateNameById(@RequestParam String name, @PathVariable long id) {
		return employeeService.updateNameById(name, id);
	}

	@DeleteMapping("/delete-by-id/{id}")
	public String deleteById(@PathVariable long id) {
		return employeeService.deleteById(id);
	}

}
