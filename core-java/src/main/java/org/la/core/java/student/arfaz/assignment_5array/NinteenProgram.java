package org.la.core.java.student.arfaz.assignment_5array;


//  wap to find duplicate elements in an array?

public class NinteenProgram {

	public static void main(String[] args) {

			int arr[] = {1, 2, 3, 4 ,3};
		
		
		for(int i=0;i<arr.length;i++) {
			
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]==arr[j])  
				  
				  System.out.println(arr[i]);
		  }
		}
        	
	}

}
