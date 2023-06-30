package org.student.three.naushad.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String subjectId;
	private String courseId;
	private String highestQualification;
	private String institudeId;

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

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getInstitudeId() {
		return institudeId;
	}

	public void setInstitudeId(String institudeId) {
		this.institudeId = institudeId;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", subjectId=" + subjectId + ", courseId=" + courseId
				+ ", highestQualification=" + highestQualification + ", institudeId=" + institudeId + "]";
	}

}
