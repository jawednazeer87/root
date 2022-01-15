package org.la.core.java.student.sajid.array.assignment5;

public class Wap53 {

	public static void main(String[] args) {
		// wap to find whether an array of characters having 'a' or not?
		// Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
		// Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'
		
		char arr[] = {'a', '5', '7', 'p'};
		
		
		boolean found=false;		
		
		System.out.println("The given array arr ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a') {
				found = true;
			}
		}


			if(found) {
				System.out.println("has a ");
			}else {
				System.out.println("doesnt have z");
			}
	
	
			char arr1[] = {'A', '5', 'Z', 'p'};
			
			System.out.println("The given array arr1 ");
	
			boolean found1=false;		
			
	
			for(int j=0;j<arr1.length;j++) {
				if(arr1[j]=='a') {
					found1 = true;
				}
				}
			
			if(found1) {
				System.out.print("has a ");
			}else {
				System.out.println("doesnt have z");
			}

	}

}
