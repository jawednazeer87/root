package org.la.core.java.student.majeed.methods;

//  wap to count occurrences of each element in an array?

public class Program7 {

	public static void main(String[] args)
    {
		int[] arr = {1,2,3,4,5,6,7,7,6,6,4,2,2};
		countEachElement(arr);
    }

 public static void countEachElement(int[] arr1) {
		for(int i=0; i<arr1.length;i++) {
			int count = 0;
			int k = arr1[i];
			
			for(int n=0; n<arr1.length;n++) {
				if(k == arr1[n]) {
					count += 1 ;
				}
			}
			
			System.out.println("Count of "+arr1[i]+" is: "+count);
		}
	}
	
 }