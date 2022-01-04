package org.la.core.java.student.sajid.array;

public class Q20 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {9,8,7,6,5,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<b.length;j++) {
				if(a[i]== b[j]) {
					System.out.println(b[j]+" :this number equal to to array");
				}
			}
		}
	}

}
