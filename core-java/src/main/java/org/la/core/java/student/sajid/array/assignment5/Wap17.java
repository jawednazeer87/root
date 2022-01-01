package org.la.core.java.student.sajid.array.assignment5;

public class Wap17 {

	public static void main(String[] args) {
		// wap to copy two arrays into one array
		
		int a[] =  {4,2,11,13};
		int b[] =  {33,44,55,66};
		
		int c[] = new int [8];
		
		int j = 0;
		for(int i=0;i<a.length;i++) {
			c[j++]=a[i];
		}

		for(int i=0;i<b.length;i++) {
			c[j++]=b[i];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"]: "+c[i]);
		}
	}

}
