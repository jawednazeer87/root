package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to test if an array contains a specific value?
 */
public class Example26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {55, 45, 69, 44};
	      int n = 4;

	      for(int i = 0; i<a.length; i++){
	         if(n == a[i]){
	            System.out.println("Array contain specific value");
	         }
	      }
	      System.out.println("Array not contain specific value");
	}

}
