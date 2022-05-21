package org.jn.adv.student.tanseer.jdbc.model;

import java.io.Serializable;

public class SalariedEmployee implements Serializable 
{
	private static final long serialVersionUID = -1443814004539007341L;
	
	private Integer id;
	private Integer annualSalary;
	private Integer employeeId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(Integer annualSalary) {
		this.annualSalary = annualSalary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "Salaried Emloyee [id = "+id+ ", AnnualSalary = "+annualSalary+ ", EmployeeId = " +employeeId+"]"+"\n";
	}
}
