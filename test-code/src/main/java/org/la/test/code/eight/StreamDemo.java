package org.la.test.code.eight;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        List<Order> orderBook = generatList();
        select(orderBook);
    }

    static void select(List<Order> orderBook){
        long count = orderBook.stream().filter(o -> o.side().equals(Order.Side.BUY)).count();
        System.out.println("count buy: "+count);

        count = orderBook.stream().filter(o -> o.side().equals(Order.Side.SELL)).count();
        System.out.println("count sell: "+count);

        double sum = orderBook.stream().mapToDouble(o -> o.price()).sum();
        System.out.println("sum: "+sum);

        long totalQ = orderBook.stream().mapToLong(o -> o.quantity()).sum();
        System.out.println("totalQ: "+totalQ);

    }


    static List<Order> generatList(){

        Order buyGoogle = new Order("GOOG.NS", 300, 900.30, Order.Side.BUY);
        Order sellGoogle = new Order("GOOG.NS", 600, 890.30, Order.Side.SELL);
        Order buyApple = new Order("APPL.NS", 400, 552, Order.Side.BUY);
        Order sellApple = new Order("APPL.NS", 200, 550, Order.Side.SELL);
        Order buyGS = new Order("GS.NS", 300, 130, Order.Side.BUY);

        List<Order> orderBook = new ArrayList<>();
        orderBook.add(buyGoogle);
        orderBook.add(sellGoogle);
        orderBook.add(buyApple);
        orderBook.add(sellApple);
        orderBook.add(buyGS);
        return orderBook;
    }
}
