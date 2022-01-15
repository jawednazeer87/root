package org.la.core.java.student.sajid.array;

public class Q8 {
	public static void main(String[] args) {
		int a[]= {35,6,9};
		int given=3;
		for(int b=0;b<a.length;b++) {
			if(a[b]%given==0) {
				System.out.println(a[b]+": divisible by given number");
			}
		}
	}

}
