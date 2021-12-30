package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 50)	wap to find the largest and smallest number in an integer array
		Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20
 */
public class Example50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100, 30, -20, 0};
		int temp[]=a;
		int temp1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
		}
		System.out.println("Largest number "+a[0]);
		a=temp;	
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
				}
			}
		}
		System.out.println("Smallest number "+a[0]);
	}

}
