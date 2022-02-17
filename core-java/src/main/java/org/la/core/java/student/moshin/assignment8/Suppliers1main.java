package org.la.core.java.student.moshin.assignment8;

public class Suppliers1main {
    public static void main(String[] args) {
        Suppliers1 suppliers = new Suppliers1();
        suppliers.setSupplierId(1);
        suppliers.setCompanyName("TCS");
        suppliers.setContact_fName("Ansari");
        suppliers.setContact_lName("moshin");
        suppliers.setContact_title("MD");
        suppliers.setAddress1("304 Park circus");
        suppliers.setAddress2("Apt D");
        suppliers.setCity("Parkcircus");
        suppliers.setState("CA");
        suppliers.setPostalCode(91801);
        suppliers.setCountry("India");
        suppliers.setPhone("6264321777");
        suppliers.setFax("6263748812");
        suppliers.setEmail("1235q3245@qq.com");
        suppliers.setUrl("www.google.com");
        suppliers.setPaymentMethods("Wire Transfer");
        suppliers.setDiscountType("No");
        suppliers.setTypeGoods("IT Products");
        suppliers.setNotes("good");
        suppliers.setDiscountAvailabe(false);
        suppliers.setCurrentOrder("No");
        suppliers.setLogo("Yes");
        suppliers.setCustomerId(1);

        System.out.println("suppliers.getSupplierId() = " + suppliers.getSupplierId());
        System.out.println("suppliers.getCompanyName() = " + suppliers.getCompanyName());
        System.out.println("suppliers.getContact_fName() = " + suppliers.getContact_fName());
        System.out.println("suppliers.getContact_lName() = " + suppliers.getContact_lName());
        System.out.println("suppliers.getContact_title() = " + suppliers.getContact_title());
        System.out.println("suppliers.getAddress1() = " + suppliers.getAddress1());
        System.out.println("suppliers.getAddress2() = " + suppliers.getAddress2());
        System.out.println("suppliers.getCity() = " + suppliers.getCity());
        System.out.println("suppliers.getState() = " + suppliers.getState());
        System.out.println("suppliers.getPostalCode() = " + suppliers.getPostalCode());
        System.out.println("suppliers.getCountry() = " + suppliers.getCountry());
        System.out.println("suppliers.getPhone() = " + suppliers.getPhone());
        System.out.println("suppliers.getFax() = " + suppliers.getFax());
        System.out.println("suppliers.getEmail() = " + suppliers.getEmail());
        System.out.println("suppliers.getUrl() = " + suppliers.getUrl());
        System.out.println("suppliers.getPaymentMethods() = " + suppliers.getPaymentMethods());
        System.out.println("suppliers.getDiscountType() = " + suppliers.getDiscountType());
        System.out.println("suppliers.getTypeGoods() = " + suppliers.getTypeGoods());
        System.out.println("suppliers.getNotes() = " + suppliers.getNotes());
        System.out.println("suppliers.isDiscountAvailabe() = " + suppliers.isDiscountAvailabe());
        System.out.println("suppliers.getCurrentOrder() = " + suppliers.getCurrentOrder());
        System.out.println("suppliers.getLogo() = " + suppliers.getLogo());
        System.out.println("suppliers.getCustomerId() = " + suppliers.getCustomerId());
    }
}
