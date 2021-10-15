package org.la.test.code.hackr.rank;

import java.math.BigInteger;

public class ExtraLongFactorial {

    public static void main(String[] args) {
        extraLongFactorials(50);
    }

    public static void extraLongFactorials(int n) {

        BigInteger result = null;
        BigInteger factorial = BigInteger.valueOf(1);
        int t = n;
        while(t>1){
            factorial = factorial.multiply(BigInteger.valueOf(t--));
        }
        System.out.println(factorial);
    }
}
