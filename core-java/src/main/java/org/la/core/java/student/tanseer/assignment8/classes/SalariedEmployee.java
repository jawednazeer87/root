package org.la.core.java.student.tanseer.assignment8.classes;
/*
 * Create a class SalariedEmployee having member variables id, annualSalary, employeeId. 
 * create getters and setters for all member variables. Create object of SalariedEmployee 
 * class in other class inside main method and set all member values and print all member 
 * values using getters.
 */
public class SalariedEmployee 
{
	private int id;
	private int annualSalary;
	private int employeeId;
	
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
	
	public void print()
	{
		System.out.println("Id\t\t : "+id);
		System.out.println("Annual Salary\t : "+annualSalary);
		System.out.println("Employee ID\t : "+employeeId);
	}
	
}
