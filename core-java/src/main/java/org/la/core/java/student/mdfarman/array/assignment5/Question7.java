package org.la.core.java.student.mdfarman.array.assignment5;

public class Question7 {
//	 07) wap to print only negative number from an array

	public static void main(String[] args) {
		int a[] = {4,5,-7,8,4,-28,8,7,-54};
		
		for (int i=0; i<a.length; i++) {
			if (a[i]<0)
				System.out.println("Negative number at index ["+i+"] :"+a[i]);
			
		}

		
	}
}
