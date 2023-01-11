package org.jn.core.java.student.shoaeeb.absclss;

public abstract class SalariedEmployeeAbsClass {
	int id;
	long annualSalary;
	int employeeId;
	
	//setters
	public abstract void setId(int id);
	public abstract void  setAnnualSalary(long annualSalary);
	public abstract void setEmployeeId(int employeeId);
	
	//getters
	public int getId() {
		return this.id;
	}
	public long getAnnualSalary() {
		return this.annualSalary;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
}
