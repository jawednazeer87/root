package org.la.test.code.algo.rskw;

public class Price implements Comparable<Price>{
    private Integer pr;
    public Price(Integer p){
        pr = p;
    }
    @Override
    public int compareTo(Price p){
        return this.pr.compareTo(p.pr);
    }
    @Override
    public String toString(){
        return Integer.toString(pr);
    }
}
