package org.la.core.java.student.datatype.Sahil;

public class d18 {
public static void main(String[] args) {
	
	
	
	   int[] arr1 = {1, 2, 3,  8};
       int[] arr2 = {1,466,64,46};
       int[] arrNew = new int[arr1.length + arr2.length];
       int j = 0;
       for (int i = 0; i < arr1.length; i++) {
           arrNew[j++] = arr1[i];
       }
       for (int i = 0; i < arr2.length; i++) {
           arrNew[j++] = arr2[i];
       }
       System.out.println("Arrays.toString(arrNew) = " + "Arrays.toString"+(arrNew[j]));
   
	
	
	
}
}
