package org.jn.adv.jawed.jdbc.controller;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.jn.adv.jawed.jdbc.dto.EmployeeDTO;
import org.jn.adv.jawed.jdbc.model.Employee;
import org.jn.adv.jawed.jdbc.service.EmployeeService;

/**
 * @author jawednazeer
 *
 */
public class EmployeeController {
	static EmployeeService employeeService = new EmployeeService();
	public static void main(String[] args) {
		//create();
		getAll().stream().forEach(employee-> {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setId(employee.getId());
			employeeDTO.setCompanyId(employee.getCompanyId());
			employeeDTO.setFirstName(employee.getFirstName());
			employeeDTO.setLastName(employee.getLastName());
			employeeDTO.setDob(employee.getDob());
			employeeDTO.setSalary(employee.getSalary());
			employeeDTO.setGenderValue(employee.getGender()?"male":"female");
			Calendar birthDay = Calendar.getInstance();
		    birthDay.setTimeInMillis(employee.getDob().getTime());
		    long currentTime = System.currentTimeMillis();
		    Calendar now = Calendar.getInstance();
		    now.setTimeInMillis(currentTime);
		    employeeDTO.setAge(now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR));
			System.out.println(employeeDTO);
		});
		
	}
	
	static void create() {
		Employee employee = new Employee();
		employee.setCompanyId(1);
		employee.setFirstName("noman");
		employee.setLastName("shareef");
		employee.setDob(new Date(1985, 7, 21));
		employee.setSalary(10000.0);
		employee.setGender(true); 			//true-> male, false-> female
		employeeService.create(employee);
		employeeService.connectionClose();
	}
	static List<Employee> getAll() {
		List<Employee> employeeList = employeeService.getAll();
		//System.out.println(employeeList);
		employeeService.connectionClose();
		return employeeList;
	}
}
