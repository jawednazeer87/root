package org.la.core.java.student.arfaz.assignment_5;


//  wap to print all prime numbers from an array 

public class TwentyOneProgram {

	public static void main(String[] args) {

			int arr[] = new int[10], i=0,k=0,j=0;
		
		
		for( i=0,j=1;i<arr.length&j<=arr.length;i++,j++) {
			
					arr[i]=j;
					for( k=2;k<arr.length;k++) {
							if(arr[i]%k==0)
								break;
						}
					if(arr[i]==k)
						System.out.println(arr[i]);
					
	  	  }
		  	 
			 
		
	}

}
