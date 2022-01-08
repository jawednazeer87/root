package org.la.core.java.student.moshin.assignment5;

public class Assignment12 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int[] copyArr = new int[5];
		int j=1;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
		}		

		int k=arr.length-1, m =0;
		while(k>=0) {
			copyArr[m] = arr[k];
			System.out.println("copyArr["+m+"]= "+copyArr[m]);			
			k--;
			m++;
		}		

	}

}
