package org.la.core.java.student.wang.assignment8;

public class SuppliersObj {
    public static void main(String[] args) {
        Suppliers suppliers = new Suppliers();
        suppliers.setSupplierId(1);
        suppliers.setCompanyName("TCS");
        suppliers.setContact_fName("ibrahim");
        suppliers.setContact_lName("wong");
        suppliers.setContact_title("PM");
        suppliers.setAddress1("304 N Stoneman Ave");
        suppliers.setAddress2("Apt D");
        suppliers.setCity("Alhambra");
        suppliers.setState("CA");
        suppliers.setPostalCode(91801);
        suppliers.setCountry("USA");
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
