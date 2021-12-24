package org.la.core.java.student.majeed.assignment5;

public class Program12 {

	public static void main(String[] args) {
		//12) wap to copy an array to another array in reverse order
		
		int[] arr = new int[20];
		int[] copyArr = new int[20];
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
