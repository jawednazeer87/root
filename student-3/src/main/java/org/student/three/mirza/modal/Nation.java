package org.student.three.mirza.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name =" countries")
public class Nation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long code;
	
	@Column (name ="name")
	private String name;
	@Column (name="continent_name")
    private String continentName;
	
 public Nation() {
	 
	 
 }

public long getCode() {
	return code;
}

public void setCode(long code) {
	this.code = code;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getContinentName() {
	return continentName;
}

public void setContinentName(String continentName) {
	this.continentName = continentName;
}

@Override
public String toString() {
	return " {code=" + code + ", name=" + name + ", continentName=" + continentName + "}";
}
	

}
