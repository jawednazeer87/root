package org.la.core.java.student.wang.assignment8;

import java.time.LocalDate;

public class MerchantsObj {
    public static void main(String[] args) {
        Merchants merchants = new Merchants();
        merchants.setId(1);
        merchants.setMerchantName("Apple");
        merchants.setAdminId(1);
        merchants.setCountryCode(1);
        merchants.setCreatedAt(LocalDate.of(2022,2,12));

        System.out.println("merchants.getId() = " + merchants.getId());
        System.out.println("merchants.getMerchantName() = " + merchants.getMerchantName());
        System.out.println("merchants.getAdminId() = " + merchants.getAdminId());
        System.out.println("merchants.getCountryCode() = " + merchants.getCountryCode());
        System.out.println("merchants.getCreatedAt() = " + merchants.getCreatedAt());

    }
}
