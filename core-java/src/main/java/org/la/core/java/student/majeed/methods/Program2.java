package org.la.core.java.student.majeed.methods;

//wap to print only even numbers from an array

public class Program2 {

	public static void main(String[] args)
    {
	  int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	  evenNumbersArray(arr1);
    }

 public static void evenNumbersArray(int[] arr) {
	 	int j=1;
	 	for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			if(arr[i]%2 == 0) 
				System.out.println("arr["+i+"]= "+arr[i]);						
		}
	}
	
 }