package org.la.core.java.student.datatype.Sahil;

public class d24 {
public static void main(String[] args) {
	 Integer[] orig = {1, 2, 3, 4, 5, 6, 1, 8, 5, 10, 1, 1};
     for (int i = 0; i <= orig.length - 1; i++) {
         for (int j = i + 1; j <= orig.length - 1; j++) {
             if (orig[i] == orig[j]) {
                 orig[j] = null;
             }
         }
     }

     System.out.println("Arrays.toString(orig) = " + "Array toString" +(orig));
 
     
     
     
}
}
