package org.jn.core.java.student.naushad.jdbc.model.dto;

public class AeroplaneDto {
	private int id;
	private String name;
	private int capacity;
	private String company_name;
	private String model_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public String toString() {
		return "AeroplaneDto [id=" + id + ", name=" + name + ", capacity=" + capacity + ", company_name=" + company_name
				+ ", model_name=" + model_name + "]";
	}

}
