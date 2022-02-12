package org.la.core.java.student.datatype.wang.assignment8;

import java.time.LocalDateTime;

public class OrdersObj {
    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.setId(1);
        orders.setStatus(1);
        orders.setUserId(1);
        orders.setCreatedAt(LocalDateTime.of(2022,1,1,8,0));

        System.out.println("orders.getId() = " + orders.getId());
        System.out.println("orders.getStatus() = " + orders.getStatus());
        System.out.println("orders.getUserId() = " + orders.getUserId());
        System.out.println("orders.getCreatedAt() = " + orders.getCreatedAt());
    }
}
