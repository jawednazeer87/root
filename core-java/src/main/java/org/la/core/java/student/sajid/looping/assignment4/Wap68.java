package org.la.core.java.student.sajid.looping.assignment4;

public class Wap68 {

	public static void main(String[] args) {
		int count;
		int n = 10;
		int sum = 0;
		
		System.out.println("Prime numbers between 1 and "+n+" are: ");
					
			for(int i=2;i<=n;i++) {   //2
				
				
				count = 0;
				
				for(int j=1;j<=i;j++) {  // 1
					
					if(i%j==0) {
						count++;
					}
				}
			if(count==2) {
				sum = sum + i;
				
			}										
		}
			System.out.print(" " +sum);
	}

}
