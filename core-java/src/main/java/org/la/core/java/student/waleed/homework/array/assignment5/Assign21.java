package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a [] = { 100, 55 ,77, 7, 79, 99,254};
		
		for(int i=0; i<a.length;i++) {
			int j;
			for( j=2; j<=a[i];j++) {
				if(a[i] % j == 0) {
					break;
					}
				}
			
		if(a[i]==j) {
		
			System.out.println(" Prime Number in array a ["+i+"] ="+a [i]);
		}
		
		
		
	}

}
}

