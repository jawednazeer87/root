package org.la.core.java.student.wang.assignment8;

import java.time.LocalDate;

public class ProductsObj {
    public static void main(String[] args) {
        Products products = new Products();
        products.setId(1);
        products.setMerchantId(1);
        products.setName("Apple");
        products.setPrice(100);
        products.setStatus(0);
        products.setCreatedAt(LocalDate.of(2022,2,12));

        System.out.println("products.getId() = " + products.getId());
        System.out.println("products.getMerchantId() = " + products.getMerchantId());
        System.out.println("products.getName() = " + products.getName());
        System.out.println("products.getPrice() = " + products.getPrice());
        System.out.println("products.getStatus() = " + products.getStatus());
        System.out.println("products.getCreatedAt() = " + products.getCreatedAt());

    }
}
