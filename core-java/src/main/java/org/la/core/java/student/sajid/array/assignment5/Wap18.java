package org.la.core.java.student.sajid.array.assignment5;

public class Wap18 {

	public static void main(String[] args) {
		// wap to add two array elements n copy into third array
		
		int a[] =  {4,2,11,13};
		int b[] =  {33,44,55,66};
		
		int c[] = new int [a.length];
		
		int j = 0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = a[i]+b[i];
			c[j++]=sum;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"]: "+c[i]);
		}

	}

}
