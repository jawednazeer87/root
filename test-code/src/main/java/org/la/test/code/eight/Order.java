package org.la.test.code.eight;

public class Order {

    enum Side {
        BUY, SELL;
    }

    private final String symbol;
    private final int quantity;
    private double price;
    private final Side side;

    public Order(String symbol, int quantity, double price, Side side) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
    }

    public double price() {
        return price;
    }

    public void price(double price) {
        this.price = price;
    }

    public String symbol() {
        return symbol;
    }

    public int quantity() {
        return quantity;
    }

    public Side side() {
        return side;
    }
}