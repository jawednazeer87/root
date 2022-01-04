package org.la.core.java.student.sajid.array;

public class Q32 {
//	wap to find the second largest element in an array?
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 7 };
		int largestNumber=0,secondLargest=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largestNumber) {
				largestNumber=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>secondLargest && a[i]<largestNumber) {
				secondLargest=a[i];
			}
		}
		System.out.println(secondLargest+": second largest number");

	}

}
