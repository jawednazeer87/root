package org.jn.core.java.student.shoaeeb.absclss;

public abstract class HourlyEmployeeAbsClass {
	int id;
	long annualSalary;
	int employeeId;
	
	//setters
	
	public abstract void setId(int id);
	public abstract void setAnnualSalary(long annualSalary);
	public abstract void setEmployeeId(int employeeId);
	
	//getters
	public abstract int getId();
	public abstract long getAnnualSalary();
	public abstract int  getEmployeeId();

}
