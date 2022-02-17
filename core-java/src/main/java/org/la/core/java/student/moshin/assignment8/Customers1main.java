package org.la.core.java.student.moshin.assignment8;

import java.time.LocalDate;

public class Customers1main {
	public static void main(String[] args) {
        Customers1 customers = new Customers1();
        customers.setCustomerId(1);
        customers.setFirstName("Ansari");
        customers.setLastName("moshin");
        customers.setClassNum(12);
        customers.setDoorNum(150);
        customers.setAddress1("304 N park circus");
        customers.setAddress2("Apt D");
        customers.setCity("Park circus");
        customers.setState("bca");
        customers.setPostalCode(91801);
        customers.setCountry("india");
        customers.setPhone("8766123455");
        customers.setEmail("12355345@qq.com");
        customers.setVoiceMail("776682345");
        customers.setPassword("asdf1235@@");
        customers.setCreditCard("183723564887629345");
        customers.setCreditCardTypeId("2");
        customers.setCardExpMonth("10");
        customers.setCardExpYr("2025");
        customers.setBillingAddress("304 N park circus");
        customers.setShipCity("Park circus");
        customers.setShipRegion("DT");
        customers.setShipCountry("India");
        customers.setShipPostalcode(91801);
        customers.setDateEntered(LocalDate.of(2022,2,14));

        System.out.println("customers.getCustomerId() = " + customers.getCustomerId());
        System.out.println("customers.getFirstName() = " + customers.getFirstName());
        System.out.println("customers.getLastName() = " + customers.getLastName());
        System.out.println("customers.getClassNum() = " + customers.getClassNum());
        System.out.println("customers.getDoorNum() = " + customers.getDoorNum());
        System.out.println("customers.getAddress1() = " + customers.getAddress1());
        System.out.println("customers.getAddress2() = " + customers.getAddress2());
        System.out.println("customers.getCity() = " + customers.getCity());
        System.out.println("customers.getState() = " + customers.getState());
        System.out.println("customers.getPostalCode() = " + customers.getPostalCode());
        System.out.println("customers.getCountry() = " + customers.getCountry());
        System.out.println("customers.getPhone() = " + customers.getPhone());
        System.out.println("customers.getEmail() = " + customers.getEmail());
        System.out.println("customers.getVoiceMail() = " + customers.getVoiceMail());
        System.out.println("customers.getPassword() = " + customers.getPassword());
        System.out.println("customers.getCreditCard() = " + customers.getCreditCard());
        System.out.println("customers.getCreditCardTypeId() = " + customers.getCreditCardTypeId());
        System.out.println("customers.getCardExpMonth() = " + customers.getCardExpMonth());
        System.out.println("customers.getCardExpYr() = " + customers.getCardExpYr());
        System.out.println("customers.getBillingAddress() = " + customers.getBillingAddress());
        System.out.println("customers.getShipAddress() = " + customers.getShipAddress());
        System.out.println("customers.getShipCity() = " + customers.getShipCity());
        System.out.println("customers.getShipRegion() = " + customers.getShipRegion());
        System.out.println("customers.getShipCountry() = " + customers.getShipCountry());
        System.out.println("customers.getShipPostalcode() = " + customers.getShipPostalcode());
        System.out.println("customers.getDateEntered() = " + customers.getDateEntered());
    }
}
