package org.jn.core.java.student.mirza.baig.clss.object;

import java.util.Date;

public class Merchants {
	
	private String merchantName;
	private int adminId;
	private String countryCode;
	private Date createdAt;
	
	
	public void setMerchantName (String merchantName) {
		this.merchantName=merchantName;
	}
	public String getMerchantName() {
		return merchantName;
		
	}
	public void setAdminId(int adminId) {
		this.adminId=adminId;
	}
	public int getAdminId() {
		return adminId;
		
	}
public void setCountryCode(String countryCode) {
	
	this.countryCode=countryCode;
}
public String getCountryCode() {
	return countryCode;
	
}
public void setCreatedAt(Date createdAt) {
	this.createdAt=createdAt;
}
public Date getCreatedAt() {
	return createdAt;
	
}
}






//Create a class Merchants having member variables id, merchantName, adminId, countryCode, createdAt.
//create getters and setters for all member variables. Create object of Merchants class in other class inside main method 
//and set all member values and print all member values using getters.