package org.la.core.java.student.majeed.methods;

//wap to test if an array contains a specific value?

public class Program3 {

	public static void main(String[] args)
    {
	  int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	  checkNumber(arr1,5);
    }

 public static void checkNumber(int[] arr1, int num) {
		boolean yes = false;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i] == num) {
				yes = true;
				break;
			}
		}	
			System.out.println(yes);
	}
	
 }