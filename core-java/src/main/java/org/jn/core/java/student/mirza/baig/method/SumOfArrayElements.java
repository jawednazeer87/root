package org.jn.core.java.student.mirza.baig.method;

public class SumOfArrayElements {

	static int sum(int [] arr) {
		int sum =0;
		for (int i=0; i<arr.length; i++)
			sum=sum+arr[i];
		
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [] arr = {10,20,30,40,50};

sum(arr);
 		
		
		
	}

}



// int sum(int[])
// find sum of all elements of an array and return sum