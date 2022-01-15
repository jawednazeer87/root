package org.la.core.java.student.arfaz.assignment_5;


// wap to count occurrences of each element in an array?

public class TwentyThreeProgram {

	public static void main(String[] args) {

			int arr[]= {10, 20, 20, 10, 10, 20, 5, 20} , i=0,k=0,j=0,c=0;
		
		
		for( i=0;i<arr.length;i++) {
			
			     c=0;
					for( k=0;k<arr.length;k++) {
						if(arr[i]==arr[k])
						c++;
				
					}
					System.out.println("Occurence = "+c+" element = "+arr[i]);
									
	  	  }
		
		
//	 Occurence = 3 element = 10
		/*Occurence = 4 element = 20
				Occurence = 4 element = 20
				Occurence = 3 element = 10
				Occurence = 3 element = 10
				Occurence = 4 element = 20
				Occurence = 1 element = 5
				Occurence = 4 element = 20*/

		
	}

}
