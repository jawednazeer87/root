package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to find greatest number from any array
 */
public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {84,14,5,157,4,12,1};
		int b=a.length;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=b) {
				b=a[i];
			}
		}
		System.out.println("Greatest of an array "+b);
	}

}
