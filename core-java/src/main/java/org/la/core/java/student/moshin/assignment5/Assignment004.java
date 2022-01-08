package org.la.core.java.student.moshin.assignment5;

public class Assignment004 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int j=1;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			if(arr[i]%2 != 0)
			System.out.println("arr["+i+"]= "+arr[i]);
		}

	}

}
