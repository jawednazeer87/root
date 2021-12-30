package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to find smallest number among array element
 */
public class Example15 {

	public static void main(String[] args) {
		int a[] = {84,14,5,1,157,4,12};
		int b=a.length;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=b) {
				b=a[i];
			}
		}
		System.out.println("Smallest of an array "+b);
	}

}
