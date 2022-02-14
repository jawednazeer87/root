package org.la.core.java.student.wang.assignment8;

import java.time.LocalDate;

public class CustomersObj {
    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.setCustomerId(1);
        customers.setFirstName("ibrahim");
        customers.setLastName("wong");
        customers.setClassNum(3);
        customers.setDoorNum(110);
        customers.setAddress1("304 N stoneman Ave");
        customers.setAddress2("Apt D");
        customers.setCity("Alhambra");
        customers.setState("CA");
        customers.setPostalCode(91801);
        customers.setCountry("USA");
        customers.setPhone("666123455");
        customers.setEmail("12355345@qq.com");
        customers.setVoiceMail("776682345");
        customers.setPassword("asdf1235@@");
        customers.setCreditCard("183723564887629345");
        customers.setCreditCardTypeId("2");
        customers.setCardExpMonth("10");
        customers.setCardExpYr("2025");
        customers.setBillingAddress("304 N Stoneman Ave");
        customers.setShipCity("Alhambra");
        customers.setShipRegion("DT");
        customers.setShipCountry("USA");
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
