package org.jn.adv.waleed.jdbc.model;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class Customers {
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String className;
	private Integer doorNum;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String phone;
	private String email;
	private String voiceMail;
	private String passowrd;
	private String creditCard;
	private String creditCardTypeId;
	private String CardExpMonth;
	private String CardExpYr;
	private String billingAddress;
	private String billingCity;
	private String billingRegion;
	private String billingPostalCode;
	private String billingCountry;
	private String shipAddress;
	private String shipCity;
	private String shipregion;
	private String shipPostalCode;
	private String shipcountry;
	private LocalDate dateEntered;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getDoorNum() {
		return doorNum;
	}
	public void setDoorNum(Integer doorNum) {
		this.doorNum = doorNum;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVoiceMail() {
		return voiceMail;
	}
	public void setVoiceMail(String voiceMail) {
		this.voiceMail = voiceMail;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getCreditCardTypeId() {
		return creditCardTypeId;
	}
	public void setCreditCardTypeId(String creditCardTypeId) {
		this.creditCardTypeId = creditCardTypeId;
	}
	public String getCardExpMonth() {
		return CardExpMonth;
	}
	public void setCardExpMonth(String cardExpMonth) {
		CardExpMonth = cardExpMonth;
	}
	public String getCardExpYr() {
		return CardExpYr;
	}
	public void setCardExpYr(String cardExpYr) {
		CardExpYr = cardExpYr;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingRegion() {
		return billingRegion;
	}
	public void setBillingRegion(String billingRegion) {
		this.billingRegion = billingRegion;
	}
	public String getBillingPostalCode() {
		return billingPostalCode;
	}
	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}
	public String getBillingCountry() {
		return billingCountry;
	}
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipregion() {
		return shipregion;
	}
	public void setShipregion(String shipregion) {
		this.shipregion = shipregion;
	}
	public String getShipPostalCode() {
		return shipPostalCode;
	}
	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}
	public String getShipcountry() {
		return shipcountry;
	}
	public void setShipcountry(String shipcountry) {
		this.shipcountry = shipcountry;
	}
	public LocalDate getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(LocalDate dateEntered) {
		this.dateEntered = dateEntered;
	}
	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", className=" + className + ", doorNum=" + doorNum + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + ", country="
				+ country + ", phone=" + phone + ", email=" + email + ", voiceMail=" + voiceMail + ", passowrd="
				+ passowrd + ", creditCard=" + creditCard + ", creditCardTypeId=" + creditCardTypeId + ", CardExpMonth="
				+ CardExpMonth + ", CardExpYr=" + CardExpYr + ", billingAddress=" + billingAddress + ", billingCity="
				+ billingCity + ", billingRegion=" + billingRegion + ", billingPostalCode=" + billingPostalCode
				+ ", billingCountry=" + billingCountry + ", shipAddress=" + shipAddress + ", shipCity=" + shipCity
				+ ", shipregion=" + shipregion + ", shipPostalCode=" + shipPostalCode + ", shipcountry=" + shipcountry
				+ ", dateEntered=" + dateEntered + "]";
	}
	
	
	
}
