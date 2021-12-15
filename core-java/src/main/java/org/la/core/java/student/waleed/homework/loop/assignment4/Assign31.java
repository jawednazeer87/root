package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
     int n = 1;
		
		while(n<=10) {
			
			if(n==7) {
				break;
			}
			System.out.println("n: "+n);
			n++;
		}
		
		System.out.println("Outside of the loop n: "+n);
		
		// in another way
		
   
		
		for(int a =1; a<=10;a++) {
			if(a==7) {
				break;
			}
			System.out.println("a: "+a);
		
		}
		
		System.out.println("Outside of the loop n: "+n);
	}

}
