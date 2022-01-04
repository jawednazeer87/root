package org.la.core.java.student.sajid.array;

public class Q25 {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,6,6,4};
		int s=0;
		int total = 0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
			total=a.length;
		}
		double ts=s/total;
		System.out.println(ts);
	}

}
