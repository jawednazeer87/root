package org.la.core.java.student.majeed.assignment5;

public class Program5 {

	public static void main(String[] args) {
		//05) wap to print only even numbers from an array
		
		int[] arr = new int[10];
		int j=1;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			if(arr[i]%2 == 0)
			System.out.println("arr["+i+"]= "+arr[i]);
		}
	}

}