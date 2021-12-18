package org.la.core.java.student.sajid.looping.assignment4;

public class Wap70 {

	public static void main(String[] args) {
		int n = 1000;
		int temp;
		int j;
		int res = 0;
		int count=0;
		
		System.out.println("Armstrong numbers between 1 to "+n+" are: ");
		
		
		for(int i=1;i<=n;i++) {
			
			j=i;
			
			
			while(j>0) {
		
				temp = j%10;
				
				res +=  (Math.pow(temp, 3)); 
				
				j = j/10;
				
			}
	
			if (res==i) {
				System.out.print(" "+i);
			}
			res = 0;
		}
	}

}
