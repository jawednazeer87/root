package org.la.core.java.student.datatype.wang.assignment8;

public class OrderItemsObj {
    public static void main(String[] args) {
        OrderItems orderItems = new OrderItems();
        orderItems.setOrderId(1);
        orderItems.setProductId(1);
        orderItems.setQuantity(100);

        System.out.println("orderItems.getOrderId() = " + orderItems.getOrderId());
        System.out.println("orderItems.getProductId() = " + orderItems.getProductId());
        System.out.println("orderItems.getQuantity() = " + orderItems.getQuantity());
    }
}
