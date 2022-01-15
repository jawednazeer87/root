package org.la.core.java.student.mdfarman.array.assignment5;

public class Question6 {
//		06) wap to print only positive number from an array

	public static void main(String[] args) {
		int a[] = {4,5,7,-8,4,-24,8,7,-52};
		
		for (int i=0; i<a.length; i++) {
			if (a[i] >= 0)
			{
				System.out.println("positive number at index ["+i+"] :"+a[i]);
			}
		}

	}

}
