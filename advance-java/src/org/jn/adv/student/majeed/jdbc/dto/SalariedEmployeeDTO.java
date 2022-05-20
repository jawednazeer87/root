package org.jn.adv.student.majeed.jdbc.dto;

/**
* @author AbdulMajeed
*
*/

public class SalariedEmployeeDTO {

	private Integer id;
	private Double annualSalary;
	private Integer employeeId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(Double annualSalary) {
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
		return "SalariedEmployee [id=" + id + ", annualSalary=" + annualSalary + ", employeeId=" + employeeId + "]";
	}	
}
