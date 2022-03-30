package org.jn.adv.student.moshin.jdbc.dto;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class HourlyEmployeeDTO {
	
	private Integer id;
	private Double HourlyRate;
	private String employeeId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getHourlyRate() {
		return HourlyRate;
	}
	public void setHourlyRate(Double hourlyRate) {
		HourlyRate = hourlyRate;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [id=" + id + ", HourlyRate=" + HourlyRate + ", employeeId=" + employeeId + "]";
	}

	
	
	
	
}
