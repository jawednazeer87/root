package org.la.core.java.student.majeed.assignment8;

import java.time.LocalDate;

/*
31.	Create a class Customers having member variables customerId, firstName, lastName, class, doorNum, address1, address2, city, 
state, postalcode, country, phone, email, voiceMail, password, creditCard, creditCardTypeId, cardExpMonth, cardExpYr, billingAddress, 
billingCity, billingRegion, billingPostalcode, billingCountry, shipAddress, shipCity, shipRegion, shipPostalcode, shipCountry, 
dateEntered. create getters and setters for all member variables. Create object of Customers class in other class inside main 
method and set all member values and print all member values using getters.
 */

public class CustomersMain {

	public static void main(String[] args) {
        Customers customers = new Customers();
        customers.setCustomerId(7);
        customers.setFirstName("Majeed");
        customers.setLastName("Mohammed");
        customers.setClassNum(10);
        customers.setDoorNum(15);
        customers.setAddress1("ABC STREET");
        customers.setAddress2("XYZ COLONY");
        customers.setCity("Hyderabad");
        customers.setState("Telangana");
        customers.setPostalCode(500001);
        customers.setCountry("INDIA");
        customers.setPhone("798798874");
        customers.setEmail("test@gmmail.com");
        customers.setVoiceMail("798798874");
        customers.setPassword("123456");
        customers.setCreditCard("1233456678991233");
        customers.setCreditCardTypeId("1");
        customers.setCardExpMonth("12");
        customers.setCardExpYr("2023");
        customers.setBillingAddress("ABC STREET");
        customers.setShipAddress("ABC STREET");
        customers.setShipCity("Hyderabad");
        customers.setShipRegion("Hyderabad");
        customers.setShipCountry("India");
        customers.setShipPostalcode(500001);
        customers.setDateEntered(LocalDate.of(2022,01,01));

        System.out.println("CustomerId: " + customers.getCustomerId());
        System.out.println("FirstName: " + customers.getFirstName());
        System.out.println("LastName: " + customers.getLastName());
        System.out.println("ClassNum: " + customers.getClassNum());
        System.out.println("DoorNum: " + customers.getDoorNum());
        System.out.println("Address1: " + customers.getAddress1());
        System.out.println("Address2: " + customers.getAddress2());
        System.out.println("City: " + customers.getCity());
        System.out.println("State: " + customers.getState());
        System.out.println("PostalCode: " + customers.getPostalCode());
        System.out.println("Country: " + customers.getCountry());
        System.out.println("Phone: " + customers.getPhone());
        System.out.println("Email: " + customers.getEmail());
        System.out.println("VoiceMail: " + customers.getVoiceMail());
        System.out.println("Password: " + customers.getPassword());
        System.out.println("CreditCard: " + customers.getCreditCard());
        System.out.println("CreditCardTypeId: " + customers.getCreditCardTypeId());
        System.out.println("CardExpMonth: " + customers.getCardExpMonth());
        System.out.println("CardExpYr: " + customers.getCardExpYr());
        System.out.println("BillingAddress: " + customers.getBillingAddress());
        System.out.println("ShipAddress: " + customers.getShipAddress());
        System.out.println("ShipCity: " + customers.getShipCity());
        System.out.println("ShipRegion: " + customers.getShipRegion());
        System.out.println("ShipCountry: " + customers.getShipCountry());
        System.out.println("ShipPostalcode: " + customers.getShipPostalcode());
        System.out.println("DateEntered: " + customers.getDateEntered());
    }	
		
}
