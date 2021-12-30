package org.la.core.java.student.sjmohammed.assignment5;

/*
 * 37) wap to separate even and odd numbers of a given array of integers. Put all even numbers first, and 
		then odd numbers ?
 */
public class Example37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {16,54,2,45,80,7,41};
		int temp,size;
		size =a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]%2!=0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}

}
