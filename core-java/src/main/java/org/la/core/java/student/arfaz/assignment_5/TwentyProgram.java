package org.la.core.java.student.arfaz.assignment_5;


//  wap to check whether two array are equal or not(means we have to check each element of two arrays)?

public class TwentyProgram {

	public static void main(String[] args) {

			int arr[] = {1, 2, 3, 4 ,3};
			int arr1[] = {1, 2, 3, 4, 3 },equal=0;
		
		for(int i=0;i<arr.length;i++) {
			
		  	  if(arr[i]==arr1[i]) {  
				  equal++;
//				  System.out.print("Equal");
		  	  }
		  	 
			 
		  
		}
		if(equal==arr1.length)
			 System.out.print("Two arrays are Equal");
		 else
	  		  System.out.println("not equal");
	}

}
