package org.la.core.java.student.sajid.array.assignment5;

public class Wap54 {

	public static void main(String[] args) {
		// wap to find whether an array of characters having 'Z' or not?
		//Suppose given array is ['a', '5', '7', 'p'] -> this array doesn't have 'Z'
		//Suppose given array is ['A', '5', 'Z', 'p'] -> this array has 'Z'
		
		char arr[] = {'a', '5', '7', 'p'};
		
		
		boolean found=false;		
		
		System.out.println("The given array arr ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='Z') {
				found = true;
			}
		}


			if(found) {
				System.out.print("has Z ");
			}else {
				System.out.println("doesnt have z");
			}
	
	
			char arr1[] = {'A', '5', 'Z', 'p'};
			
			System.out.println("The given array arr1 ");
	
			boolean found1=false;		
			
	
			for(int j=0;j<arr1.length;j++) {
				if(arr1[j]=='Z') {
					found1 = true;
				}
				}
			
			if(found1) {
				System.out.print("has Z ");
			}else {
				System.out.println("doesnt have z");
			}
		}
	}


