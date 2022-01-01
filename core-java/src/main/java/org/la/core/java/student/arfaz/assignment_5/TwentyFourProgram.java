package org.la.core.java.student.arfaz.assignment_5;


// wap to remove duplicate elements from an array? 

public class TwentyFourProgram {

	public static void main(String[] args) {

			int arr[]= {10, 20, 20} , i=0,k=0;
		
		
		for( i=0;i<arr.length;i++) {
			
					k=0;
						if(arr[i]!=arr[k])  {
							
							arr[i]=arr[i+1];
						}
						
						k++;
					
					
									
	  	  }
		
		for(int res:arr)  {
			System.out.println(res);
		}

		
	}

}
