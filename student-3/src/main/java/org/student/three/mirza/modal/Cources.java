package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name ="cources")
public class Cources {
	                        // id, name, start_date, end_date, duration, institute_name, faculty_id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column (name  ="name")
	private String name;
	@Column (name ="start_date")
	private Date startDate;
	@Column (name ="end_date")
	private Date endDate;
	@Column (name = "duration")
	private String duration;
	@Column (name ="institute_name")
	private String instituteName;
	@Column (name  ="faculty_id")
	private int facultyId;
	
	public Cources () {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	@Override
	public String toString() {
		return " { id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", duration=" + duration + ", instituteName=" + instituteName + ", facultyId=" + facultyId + "}";
	}
	
	
	
	

}
