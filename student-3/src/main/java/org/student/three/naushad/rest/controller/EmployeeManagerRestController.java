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
import org.student.three.naushad.model.EmployeeManager;
import org.student.three.naushad.service.EmployeeManagerService;

@RestController
@RequestMapping("/employee-manager")
public class EmployeeManagerRestController {

	@Autowired
	private EmployeeManagerService employeeManagerService;

	@PostMapping("/save")
	public EmployeeManager create(@RequestBody EmployeeManager employeeManager) {
		return employeeManagerService.create(employeeManager);
	}

	@GetMapping("/get-by-id")
	public EmployeeManager getById(@RequestParam long id) {
		return employeeManagerService.getById(id);
	}

	@GetMapping("/get-all")
	public List<EmployeeManager> getAll() {
		return employeeManagerService.getAll();
	}

	@GetMapping("/get-by-email")
	public EmployeeManager getByEmail(@RequestParam String email) {
		return employeeManagerService.getByEmail(email);
	}

	@PatchMapping("/update-name-by-id/{id}")
	public EmployeeManager updateNameById(@RequestParam String name, @PathVariable long id) {
		return employeeManagerService.updateNameById(name, id);

	}

	@PatchMapping("/update-name-by-email")
	public EmployeeManager updateNameByemail(@RequestParam String name, @RequestParam String email) {
		return employeeManagerService.updateNameByemail(name, email);
	}

	@DeleteMapping("/delte-by-id/{id}")
	public String deleteById(@PathVariable long id) {
		return employeeManagerService.deleteById(id);
	}
}
