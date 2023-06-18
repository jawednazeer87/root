package org.jn.core.java.student.mirza.jdbc.model;

public class Employee {

	
	private int Id;
	
	private int hourlyRate;
	private int employeeId;
	
	public Employee () {
		
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee {Id=" + Id + ", hourlyRate=" + hourlyRate + ", employeeId=" + employeeId + "}";
	}
	
}
