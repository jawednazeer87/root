package org.jn.core.java.student.shoaeeb.lambda;

public class PrintArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray p = (arr)-> {
			for(int ele: arr)
				System.out.println(ele);
		};
		
		int arr[]= {1,2,3,4,5,6};
		p.printArray(arr);
	}

}
