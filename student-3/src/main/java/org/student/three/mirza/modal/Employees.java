package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table (name ="em")
public class Employees {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    @Column (name = "employee_name")
    private String employeeName;
    @Column (name ="employee_num")
    private String employeeNum;
    @Column (name ="date_hired")
    private Date dateHired;
    @Column (name ="city_id")
    private int cityId;
    
    public Employees() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	@Override
	public String toString() {
		return "{ id=" + id + ", employeeName=" + employeeName + ", employeeNum=" + employeeNum
				+ ", dateHired=" + dateHired + ", cityId=" + cityId + "}";
	}
    
    

}
