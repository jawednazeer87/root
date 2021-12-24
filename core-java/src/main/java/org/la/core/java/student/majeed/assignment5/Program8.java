package org.la.core.java.student.majeed.assignment5;

public class Program8 {

	public static void main(String[] args) {
		//08) wap to print number divisible by given number from an array
		
		int[] arr = new int[20];
		int j=1, divisibleNumber = 3;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			if(arr[i]%divisibleNumber == 0)
			System.out.println("arr["+i+"]= "+arr[i]);
		}
	}

}
