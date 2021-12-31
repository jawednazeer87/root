package org.la.core.java.student.mdfarman.array.assignment5;

public class Question4 {
//		04) wap to print only odd numbers from an array

	public static void main(String[] args) {
		int a[] = {4,5,7,8,4,24,8,7,52};
		
		for (int i=0; i<a.length; i++) {
			if (a[i] % 2 != 0)
			{
				System.out.println("odd number at index ["+i+"] :"+a[i]);
			}
		}

	}

}
