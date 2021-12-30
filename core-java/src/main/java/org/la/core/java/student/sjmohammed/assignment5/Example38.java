package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 38) Find largest and smallest elements of an array? 
 */
public class Example38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {65,4,6,35,537,35,48};
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
