package org.la.core.java.student.moshin.assignment5;

public class Assignment52 {
	
	public static void main(String[] args) {

		int[] arr1 = {10, 19, 2, 7};
		int sum =0;
		for(int m=0;m<arr1.length;m++) {
			sum += arr1[m];
		}	

			int i = 2;
			int j = sum;
			boolean k = true;
			while(i<=j) {			
				
				if(i!=j && j%i==0) {
					k = false;
					break;
				}
				i++;
			}
			
			if (k==true && j!=1) {
				System.out.println(sum+" is a Prime");
			} else
				System.out.println(sum+" is not a Prime");
	}
}
