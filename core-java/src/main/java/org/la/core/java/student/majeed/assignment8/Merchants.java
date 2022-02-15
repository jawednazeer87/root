package org.la.core.java.student.majeed.assignment8;

/*
13.	Create a class Merchants having member variables id, merchantName, adminId, countryCode, createdAt. 
create getters and setters for all member variables. Create object of Merchants class in other class 
inside main method and set all member values and print all member values using getters.
 */

public class Merchants {
    private int id;
    private int adminId;
    private int countryCode;
    private String merchantName;
    private String createdAt;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
		
}
