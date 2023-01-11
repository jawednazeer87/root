package org.jn.core.java.student.shoaeeb.absclss;

public abstract class MerchantsAbsClass {
	int id;
	String merchantName;
	int adminId;
	int countryCode;
	
	
	//setters
	public abstract void setId(int id);
	public abstract void setMerchantName(String merchantName);
	public abstract void setAdminId(int adminId);
	public abstract void setCountryCode(int countryCode);
	
	//getters
	public abstract int getId();
	public abstract String getMerchantName();
	public abstract int getAdminId();
	public abstract int getCountryCode();
	
}
