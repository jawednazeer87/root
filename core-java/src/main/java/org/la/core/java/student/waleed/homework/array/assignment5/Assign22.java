package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f = 1;
		int a [] = {3,4,5,7,9};
		int k = a.length-1;
		for(int i =0; i<=k;i++) {
			
		for(int j=1; j<=a[i];j++) {
			
			f = f * j;
		}
		
		System.out.println("factorial: of a[" +i+"] ="+ f);
		f=1;
	}

}
	
}
