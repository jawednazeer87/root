package org.la.test.code.hackr.rank;

import java.util.List;

public class SumOfVeryBigNum {

    public static void main(String[] args) {

    }

    public static long aVeryBigSum(List<Long> ar) {

        return ar.stream().reduce(0l, SumOfVeryBigNum::add);
    }

    public static long add(long a, long b){
        return a+b;
    }
}
