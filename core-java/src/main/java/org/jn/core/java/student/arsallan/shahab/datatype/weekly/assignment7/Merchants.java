package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class Merchants {

	int id;
	String merchantName;
	int adminId;
	int countryCode;
	String createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString() {
		return "Merchants [id=" + id + ", merchantName=" + merchantName + ", adminId=" + adminId + ", countryCode="
				+ countryCode + ", createdAt=" + createdAt + "]";
	}
	
	
	
}
