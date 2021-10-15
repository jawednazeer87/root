package org.la.test.code.algo.rskw.model;

public class Price implements Comparable<Price>{

    private Integer price;
    public Price(){}
    public Price(int p){
        price = p;
    }
    @Override
    public int compareTo(Price that){
        return this.price.compareTo(that.price);
    }

}
