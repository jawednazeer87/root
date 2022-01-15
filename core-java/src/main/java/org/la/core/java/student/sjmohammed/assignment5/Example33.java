package org.la.core.java.student.sjmohammed.assignment5;
/*
 * wap to find the second smallest element in an array?
 */

public class Example33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,45,15,4,8,71,26,89};
		int temp,size;
		size =a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Largest number is: "+a[size-2]);
	}

}
