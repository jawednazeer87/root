package org.la.core.java.student.datatype.Sahil;

public class d22 {
public static void main(String[] args) {
	 int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
     for (int i = 0; i < a.length; i++) {
         int n = a[i], f = 1;
         while (n >= 1) {
             f = f * n;
             n--;
         }
         System.out.println(a[i] + "'s factorial is " + f);

     }
     }
}
