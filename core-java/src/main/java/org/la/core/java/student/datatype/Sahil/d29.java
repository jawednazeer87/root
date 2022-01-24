package org.la.core.java.student.datatype.Sahil;

public class d29 {
public static void main(String[] args) {
	 int[] a = {4, 2, 3, 1, 7};
     int[] resultA = new int[a.length + 1];
     int element = 10;
     int index = 3;
     for (int i = 0; i < a.length + 1; i++) {
         if (i < index) {
             resultA[i] = a[i];
         } else if (i == index) {
             resultA[i] = element;
         } else {
             resultA[i] = a[i - 1];
         }

     }
     System.out.println("Arrays.toString(resultA) = " + "Arrays.toString" + (resultA));
}
}
