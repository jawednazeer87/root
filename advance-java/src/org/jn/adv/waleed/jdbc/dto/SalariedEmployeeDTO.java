package org.jn.adv.waleed.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class SalariedEmployeeDTO {
	private Integer id;
	private Double annualSalary;
	private String employeeId;
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "SalariedEmployee [id=" + id + ", annualSalary=" + annualSalary + ", employeeId=" + employeeId + "]";
	}

	
	
}
