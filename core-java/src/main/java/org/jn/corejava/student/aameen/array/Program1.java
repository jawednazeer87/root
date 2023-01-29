package org.jn.corejava.student.aameen.array;

public class Program1 {

	public static void main(String[] args) {
		// Printing array 
		// it is not dynamic 
		int arr[] = {1,2,3};
		System.out.println("arr[0] : "+arr[0]);
		System.out.println("arr[1] : "+arr[1]);
		System.out.println("arr[2] : "+arr[2]);
		System.out.println(" ");
		
		int a[]=new int[5];
		System.out.println("a[0] : "+a[0]);
		System.out.println("a[1] : "+a[1]);
		System.out.println("a[2] : "+a[2]);
		System.out.println("a[3] : "+a[3]);
		System.out.println("a[4] : "+a[4]);
		System.out.println(" ");
		a[0]=1;
		a[1]=2;
		a[2]=4;
		a[3]=6;
		a[4]=8;
		System.out.println("a[0] : "+a[0]);
		System.out.println("a[1] : "+a[1]);
		System.out.println("a[2] : "+a[2]);
		System.out.println("a[3] : "+a[3]);
		System.out.println("a[4] : "+a[4]);
		System.out.println(" ");
	}

}
