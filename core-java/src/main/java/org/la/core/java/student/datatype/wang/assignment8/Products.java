package org.la.core.java.student.datatype.wang.assignment8;

import java.time.LocalDate;

public class Products {
    /*
    14.	Create a class Products having member variables id, merchantId, name, price, status, createdAt. create getters and setters for all member variables. Create object of Products class in other class inside main method and set all member values and print all member values using getters.
     */
    private int id, merchantId, price, status;
    private String name;
    private LocalDate createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
