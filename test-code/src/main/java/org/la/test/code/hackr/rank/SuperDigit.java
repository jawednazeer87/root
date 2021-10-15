package org.la.test.code.hackr.rank;

import java.math.BigInteger;
import java.util.stream.IntStream;

/*
    here is a formula that
    sum of digit of any number again and again till reach to single digit num
    is: divide number by 9
    if remainder is zero then the last digit of recursive sum is 9
    if remainder is non zero then that is the single digit sum
    formula is
    n = number, k = number of times to repeat ur number
    r = (n*k) % 9
    result = (r==0) ? 9 : r;
    formula
    http://applet-magic.com/digitsummod9.htm
    https://www.khanacademy.org/math/in-in-class-6th-math-cbse/x06b5af6950647cd2:playing-with-numbers/x06b5af6950647cd2:tests-for-divisibility/v/the-why-of-the-9-divisibility-rule
    url of super digit hackerrank code: https://github.com/asifaftab87/test-code/blob/main/root/test-code/src/main/java/org/la/test/code/hackr/rank/SuperDigit.java
 */
public class SuperDigit {
    public static int superDigit(String n, int k) {
        BigInteger bi = new BigInteger(n);
        bi = bi.multiply(new BigInteger(String.valueOf(k)));
        BigInteger r = bi.mod(new BigInteger(String.valueOf(9)));
        StringBuilder sb = new StringBuilder(n);
        IntStream.range(0, k-1).forEach(i -> {
            sb.append(n);
        });
        return r.intValue()==0 ? 9 : r.intValue();
    }
    public static void main(String[] args) {
        int r = superDigit("123", 3);
        r = superDigit("9875", 4);
        System.out.println(r);
    }

}
