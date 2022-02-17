	package org.la.core.java.student.arfaz.assignment_5array;



/*  Find largest and smallest elements of an array */

public class ThirtyEightProgram {

	public static void main(String[] args) {

			int arr[]= {80,70,60,10,50,40,1,2,3,4}, fs=0,temp;
			
			
			for(int i=0;i<arr.length;i++)  {
				fs=0;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j])  {
						fs=1;
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
							
					if(fs==0)
						break;
				}
//					
		}
			
				System.out.println(arr[arr.length-1]);
				System.out.println(arr[0]);
					
	}

}
