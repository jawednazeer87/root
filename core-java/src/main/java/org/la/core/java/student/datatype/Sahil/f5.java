package org.la.core.java.student.datatype.Sahil;

public class f5 {
public static void main(String[] args) {
	int arr1[]= {1,2,3,-4,-5};
	int arr2[]= {5,6,4,-7,-8};
	  int length = arr1.length + arr2.length;
      int[] arr = new int[length];
      int j = 0;
      for (int i = 0; i < arr1.length; i++) {
          arr[j++] = arr[i];
      }
      for (int i = 0; i < arr2.length; i++) {
          arr[j++] = arr2[i];
      }
      System.out.println("Arrays.toString"+(arr));
}
}
