package org.la.core.java.student.wang.assignment8;

import java.time.LocalDate;

public class Customers {
    /*
    31.	Create a class Customers having member variables customerId, firstName, lastName, class, doorNum, address1, address2, city, state, postalcode, country, phone, email, voiceMail, password, creditCard, creditCardTypeId, cardExpMonth, cardExpYr, billingAddress, billingCity, billingRegion, billingPostalcode, billingCountry, shipAddress, shipCity, shipRegion, shipPostalcode, shipCountry, dateEntered. create getters and setters for all member variables. Create object of Customers class in other class inside main method and set all member values and print all member values using getters.
     */
    private int customerId, classNum, doorNum, postalCode,billingPostalcode, shipPostalcode;
    private String firstName, lastName, address1, address2, city, state, country, phone, email, voiceMail, password, creditCard,creditCardTypeId,cardExpMonth, cardExpYr, billingAddress, billingCity, billingRegion, billingCountry, shipAddress, shipCity, shipRegion, shipCountry;
    private LocalDate dateEntered;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getBillingPostalcode() {
        return billingPostalcode;
    }

    public void setBillingPostalcode(int billingPostalcode) {
        this.billingPostalcode = billingPostalcode;
    }

    public int getShipPostalcode() {
        return shipPostalcode;
    }

    public void setShipPostalcode(int shipPostalcode) {
        this.shipPostalcode = shipPostalcode;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return cardExpMonth;
    }

    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    public String getCardExpYr() {
        return cardExpYr;
    }

    public void setCardExpYr(String cardExpYr) {
        this.cardExpYr = cardExpYr;
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

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public LocalDate getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(LocalDate dateEntered) {
        this.dateEntered = dateEntered;
    }
}
