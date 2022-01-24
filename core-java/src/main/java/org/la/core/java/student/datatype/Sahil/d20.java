package org.la.core.java.student.datatype.Sahil;

public class d20 {
public static void main(String[] args) {
	 int[] a = {1, 2, 3, 4, 2, 7, 8, 8, 3};
     int[] b = {2, 2, 3, 4, 2, 7, 8, 8, 3};
     boolean isEqual = true;
     if (a.length == b.length) {
         for (int i = 0; i < a.length; i++) {
             if (a[i] != b[i]) {
                 isEqual = false;
             }
         }
     } else {
         isEqual = false;
     }
     if (isEqual) {
         System.out.println("Two arrays are equal");
     } else {
         System.out.println("Two arrays are not equal");
     }

}
}
