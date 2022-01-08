package org.la.core.java.student.moshin.assignment5;

public class Assignment16 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[20];
		int j=1;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
		}
		for(int k=arr.length-1; k>=0;k--) {		
			System.out.println("arr["+k+"]= "+arr[k]);
		}
	}

}
