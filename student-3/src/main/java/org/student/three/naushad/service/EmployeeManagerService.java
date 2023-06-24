package org.student.three.naushad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.naushad.model.EmployeeManager;
import org.student.three.naushad.repository.EmployeeManagerRepository;

@Service
public class EmployeeManagerService {

	@Autowired
	private EmployeeManagerRepository employeeManagerRepository;

	public EmployeeManager create(EmployeeManager employeeManager) {
		return employeeManagerRepository.save(employeeManager);
	}

	public EmployeeManager getById(long id) {
		Optional<EmployeeManager> employeemanagerOptional = employeeManagerRepository.findById(id);
		if (employeemanagerOptional.isPresent()) {
			return employeemanagerOptional.get();
		} else {
			return null;
		}

	}

	public List<EmployeeManager> getAll() {
		return employeeManagerRepository.findAll();
	}

	public EmployeeManager getByEmail(String email) {
		return employeeManagerRepository.findByEmail(email);
	}

	public EmployeeManager updateNameById(String name, long id) {
		EmployeeManager employeeManager = getById(id);
		if (employeeManager != null) {
			employeeManager.setName(name);
			return employeeManagerRepository.save(employeeManager);
		}
		return employeeManager;
	}

	public EmployeeManager updateNameByemail(String name, String email) {
		EmployeeManager employeeManager = getByEmail(email);
		if (employeeManager != null) {
			employeeManager.setName(name);
			return employeeManagerRepository.save(employeeManager);
		}
		return employeeManager;
	}

	public String deleteById(long id) {
		EmployeeManager employeeManager = getById(id);
		if (employeeManager != null) {
			employeeManagerRepository.delete(employeeManager);
			return "Deleted";
		}
		return "Not found";
	}

}
