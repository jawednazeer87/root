package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a [] = {44, 11 , 99, 50, 75 ,88,60,177};
		int sum =0;
		for(int i=0 ; i<=a.length-1 ; i++) {
			if(a [i] %2==0) {
				sum+= a[i];
				
	           }

           }
		System.out.print("Sum = "+sum);
	}

}
