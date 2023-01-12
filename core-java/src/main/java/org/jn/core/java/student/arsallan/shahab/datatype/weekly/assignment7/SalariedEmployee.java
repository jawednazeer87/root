package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class SalariedEmployee {
	int id;
	int annualSalary;
	int employeeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [id=" + id + ", annualSalary=" + annualSalary + ", employeeId=" + employeeId + "]";
	}
	
	
}
