package org.jn.core.java.student.mirza.baig.method;

public class AverageArratElements {
	
	static int avg(int []a) {
		int avg=0;
		int sum=0;
		
		for (int i=0; i<a.length; i++)
			sum=sum+a.length;
		avg=sum/a.length;
			System.out.println(avg);
		
			
			
		return avg;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] a={1,2,3,4,5,6,7,8,10};
		 
		 avg(a);
		
		
		 }
		 
	}





// int average(int[])

// find the average of array elements and return average//