package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="train")
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
	@Column (name ="train_num")
	private long trainNum;
	@Column (name ="rout_name")
	private String routName;
	@Column (name ="arrival_date")
	private Date arrivalDate;
	@Column (name = "departure_date")
	private  Date departureDate;
	@Column (name = "city_name")
	private String cityName;
	
 public Train () {}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public long getTrainNum() {
	return trainNum;
}

public void setTrainNum(long trainNum) {
	this.trainNum = trainNum;
}

public String getRoutName() {
	return routName;
}

public void setRoutName(String routName) {
	this.routName = routName;
}

public Date getArrivalDate() {
	return arrivalDate;
}

public void setArrivalDate(Date arrivalDate) {
	this.arrivalDate = arrivalDate;
}

public Date getDepartureDate() {
	return departureDate;
}

public void setDepartureDate(Date departureDate) {
	this.departureDate = departureDate;
}

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

@Override
public String toString() {
	return " {id=" + id + ", trainNum=" + trainNum + ", routName=" + routName + ", arrivalDate=" + arrivalDate
			+ ", departureDate=" + departureDate + ", cityName=" + cityName + "}";
}
 
 
}
