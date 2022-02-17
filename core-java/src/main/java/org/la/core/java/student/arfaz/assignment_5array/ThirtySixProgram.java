package org.la.core.java.student.arfaz.assignment_5array;


/* wap to remove all zeros element from an array? */

public class ThirtySixProgram {

	public static void main(String[] args) {

			int arr[]= {20,20,30,40,50,50,50},j=0,c=0 ;
			
			
			for(int i=0;i<arr.length-1;i++)  {
			if(arr[i]!=arr[i+1]) {
				arr[j] = arr[i];
				j++;
			}
			
		}
			arr[j]=arr[arr.length-1];
			for(int i=0;i<=j;i++)   {
				c++;
				System.out.print(arr[i]+" ");
			}
				System.out.println("\nnew array length "+c);
	
	
         	
		
	}

}
