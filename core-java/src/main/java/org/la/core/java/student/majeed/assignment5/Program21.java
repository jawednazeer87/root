package org.la.core.java.student.majeed.assignment5;

public class Program21 {

	public static void main(String[] args) {
		//21) wap to print all prime numbers from an array ?
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11};
		
		for(int n=0; n<arr1.length;n++) {
			int i = 2;
			int j = arr1[n];
			boolean k = true;
			while(i<=j) {			
				
				if(i!=j && j%i==0) {
					k = false;
					break;
				}
				i++;
				
			}
			
			if (k==true && j!=1) 
				System.out.println(j);
			
			}
	}
}
