package org.student.three.mirzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.three.mirza.modal.Employees;
import org.student.three.mirza.repository.EmployeesRepository;

@ Service
public class EmployeesService {
	
	@Autowired
	public EmployeesRepository employeesRepository;
	
	public List<Employees> getAll(){
		return employeesRepository.findAll();
		
	}
	public Employees  create (Employees employees) {
		return employeesRepository.save(employees);
		
	}
	public Employees findByEmployeesNum (String employeesNum) {
		
		return employeesRepository.findByEmployeeNum(employeesNum);
	}

	public Employees updateByEmployeeNum (String employeeNum , String empLoyeeName) {
		Employees employees = employeesRepository.findByEmployeeNum(employeeNum);
		if (employees != null) {
			employees.setEmployeeName(empLoyeeName);
			employees = employeesRepository.save(employees);
			
		}
		return employees;
	}
	public void deleteById (long id) {
		Employees employees = employeesRepository.getReferenceById(id);
		
		if (employees != null) {
			employeesRepository.delete(employees);
		}
	}
	public List <Employees> findByEmployeeName (String employeeName){
		
		return employeesRepository.findByEmployeeName(employeeName);
	}
	
	}
	

