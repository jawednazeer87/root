package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "aeroplane")
public class Aeroplanes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   @Column (name ="name")
   private String name;
   @Column (name= "capacity")
   private String capacity;
   @Column (name= "company_name")
   private String  companyName;
   @Column (name= "model_name")
   private String modelName;
   @Column (name= "crieated_date")
   private Date createdDate;
   @Column (name= "model")
   private String model;
   
   
   public Aeroplanes() { }


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


public String getCapacity() {
	return capacity;
}


public void setCapacity(String capacity) {
	this.capacity = capacity;
}


public String getCompanyName() {
	return companyName;
}


public void setCompanyName(String companyName) {
	this.companyName = companyName;
}


public String getModelName() {
	return modelName;
}


public void setModelName(String modelName) {
	this.modelName = modelName;
}


public Date getCreatedDate() {
	return createdDate;
}


public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


@Override
public String toString() {
	return " {d=" + id + ", name=" + name + ", capacity=" + capacity + ", companyName=" + companyName
			+ ", modelName=" + modelName + ", createdDate=" + createdDate + ", model=" + model + "}";
}
   
   
   

}
