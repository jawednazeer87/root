package org.la.core.java.student.majeed.assignment5;

public class Program6 {

	public static void main(String[] args) {
		//06) wap to print only positive number from an array
		
		int[] arr = new int[20];
		int j=-10;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
			if(arr[i] > 0)
			System.out.println("arr["+i+"]= "+arr[i]);
		}
	}

}
