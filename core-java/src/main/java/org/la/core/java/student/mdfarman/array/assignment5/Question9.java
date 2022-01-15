package org.la.core.java.student.mdfarman.array.assignment5;

public class Question9 {
//	 09) wap to print number not divisible by given number from an array


	public static void main(String[] args) {
		int a[] = {4,5,7,8,4,28,8,7,-54};
		int divby = 7; 
		
		for (int i=0; i<a.length; i++) {
			if (a[i]%divby!=0)
				System.out.println("Index ["+i+"] :"+a[i]);
			
		}

		
	}
}
