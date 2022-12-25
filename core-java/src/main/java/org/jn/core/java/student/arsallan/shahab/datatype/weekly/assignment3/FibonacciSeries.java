package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment3;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first=0,second=1,fibonacci;
		int n=15;
		for(int i=0; i<n;i++) {
			if(i==0 ||  i==1) {
				System.out.println(i);
				continue;
			}
			fibonacci = first + second;
			first = second;
			second = fibonacci;
			System.out.println(fibonacci);
		}
	}

}
