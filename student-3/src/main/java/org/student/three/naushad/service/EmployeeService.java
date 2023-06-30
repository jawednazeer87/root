package org.student.three.naushad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.naushad.model.Employee;
import org.student.three.naushad.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getById(long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}

	public List<Employee> getByCity(String city) {
		return employeeRepository.findByCity(city);
	}

	public List<Employee> getByState(String state) {
		return employeeRepository.findByState(state);
	}

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee updateNameById(String name, long id) {
		Employee employee = getById(id);
		if (employee != null) {
			employee.setName(name);
			return employeeRepository.save(employee);
		}
		return employee;
	}

	public String deleteById(long id) {
		Employee employee = getById(id);
		if (employee != null) {
			employeeRepository.delete(employee);
			return "Deleted successfully";
		} else
			return "Not Found";
	}

}
