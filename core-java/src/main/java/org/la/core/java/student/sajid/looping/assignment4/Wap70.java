package org.la.core.java.student.sajid.looping.assignment4;

public class Wap70 {

	//Print armstrong numbers from 1 to n
	public static void main(String[] args) {
		int n = 100000;
		int temp;
	
		
		
		System.out.println("Armstrong numbers between 1 to "+n+" are: ");
		
		for(int a=1;a<n;a++) {
			int count=0;
			int res = 0;
			int j = a;
			
			while(j>0) { //count digits of the number
				count++;
				j/=10;
			}

			j = a;
			
			while(j>0) { //loop to find the Armstrong number
		
				temp = j%10;
				
				res +=  (Math.pow(temp, count)); 
				
				j = j/10;
				
			}
	
			if (res==a) {
				System.out.print(" "+a);
			}
		}
	}
}

