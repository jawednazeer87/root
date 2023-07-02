package org.student.three.mirza.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name ="mirzaClient")
@Table (name = "client")
	public class Client {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	@Column(name  = " name")
	private String name;
	@Column (name = " address")
	private String  adress;
	@Column (name ="city")
	private String city;
	@Column (name ="zip")
	private long zip;
	@Column (name ="state")
	private String state;
	@Column (name ="country")
	private String country;
	@Column (name ="email")
	private String email;
		
public Client() {}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public long getZip() {
	return zip;
}

public void setZip(long zip) {
	this.zip = zip;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "  {name=" + name + ", adress=" + adress + ", city=" + city + ", zip=" + zip + ", state=" + state
			+ ", country=" + country + ", email=" + email + "}";
}



}
