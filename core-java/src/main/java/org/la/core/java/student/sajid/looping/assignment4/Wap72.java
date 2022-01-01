package org.la.core.java.student.sajid.looping.assignment4;

public class Wap72 {

// Wap to print all Perfect numbers between 1 to n
	
		public static void main(String[] args) {
			int n = 497;
			
			System.out.println("Perfect numbers from 1 to "+n+" are: ");
			
			for(int i=1;i<=n;i++) {
				int sum = 0;
							
				for(int j=1;j<i;j++) {
						
					if(i%j == 0){			
						sum=sum+j;			
					}
				}							
				if (i==sum) {
				System.out.print(" "+i);
			}
		}

	}

}
