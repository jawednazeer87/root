package org.la.core.java.student.datatype.Sahil;

public class c43 {
	public static void main(String[] args) {
        int s = 0, n = 12345;
        while (n > 0) {
            int r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        System.out.println(s);
    }
}
