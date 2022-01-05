package org.la.core.java.student.arfaz.assignment_5;


// wap to remove duplicate elements from an array? 

public class TwentyFourProgram {

	public static void main(String[] args) {

			int arr[]= {10, 20, 20,30,30}, j=0;
		int []t = new int[arr.length];
		
		for(int i=0;i<arr.length-1;i++) {
			
						if(arr[i]!=arr[i+1])  {
							
							t[j]=arr[i];
							j++;
						}
						
					
					
									
	  	  }
		t[j]=arr[arr.length-1];
		for(int res:t)  {
			System.out.println(res);
		}

		
	}

}
