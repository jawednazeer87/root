package org.la.core.java.student.majeed.assignment8;

/*
32.	Create a class Suppliers having member variables supplierId, companyName, contact_fName, contact_lName, contact_title, 
address1, address2, city, state, postalcode, country, phone, fax, email,
url, paymentMethods, discountType, typeGoods_, notes, discountAvailabe, currentOrder, logo, customerId. 
create getters and setters for all member variables. Create object of Suppliers class in other class inside 
main method and set all member values and print all member values using getters.
 */

public class SuppliersMain {

    public static void main(String[] args) {
        Suppliers suppliers = new Suppliers();
        suppliers.setSupplierId(1);
        suppliers.setCompanyName("ABC Corporation");
        suppliers.setContact_fName("Majeed");
        suppliers.setContact_lName("Mohammed");
        suppliers.setContact_title("Mohammed");
        suppliers.setAddress1("ABC STREET");
        suppliers.setAddress2("XYZ COLONY");
        suppliers.setCity("HYDERABAD");
        suppliers.setState("TELENGANA");
        suppliers.setPostalCode(500001);
        suppliers.setCountry("INDIA");
        suppliers.setPhone("9988778899");
        suppliers.setFax("9988778899");
        suppliers.setEmail("majeed@gmail.com");
        suppliers.setUrl("www.abc.com");
        suppliers.setPaymentMethods("Debit Card");
        suppliers.setDiscountType("LOYALTY DISCOUNT");
        suppliers.setTypeGoods("JEANS");
        suppliers.setNotes("denim color");
        suppliers.setDiscountAvailabe(true);
        suppliers.setCurrentOrder("In Progress");
        suppliers.setLogo("ABC");
        suppliers.setCustomerId(501);

        System.out.println("SupplierId: " + suppliers.getSupplierId());
        System.out.println("CompanyName: " + suppliers.getCompanyName());
        System.out.println("Contact_fName: " + suppliers.getContact_fName());
        System.out.println("Contact_lName: " + suppliers.getContact_lName());
        System.out.println("Contact_title: " + suppliers.getContact_title());
        System.out.println("Address1: " + suppliers.getAddress1());
        System.out.println("Address2: " + suppliers.getAddress2());
        System.out.println("City: " + suppliers.getCity());
        System.out.println("State: " + suppliers.getState());
        System.out.println("PostalCode: " + suppliers.getPostalCode());
        System.out.println("Country: " + suppliers.getCountry());
        System.out.println("Phone: " + suppliers.getPhone());
        System.out.println("Fax: " + suppliers.getFax());
        System.out.println("Email: " + suppliers.getEmail());
        System.out.println("Url: " + suppliers.getUrl());
        System.out.println("PaymentMethods: " + suppliers.getPaymentMethods());
        System.out.println("DiscountType: " + suppliers.getDiscountType());
        System.out.println("TypeGoods: " + suppliers.getTypeGoods());
        System.out.println("Notes: " + suppliers.getNotes());
        System.out.println("suppliers.isDiscountAvailabe: " + suppliers.isDiscountAvailabe());
        System.out.println("CurrentOrder: " + suppliers.getCurrentOrder());
        System.out.println("Logo: " + suppliers.getLogo());
        System.out.println("CustomerId: " + suppliers.getCustomerId());
    }
}
