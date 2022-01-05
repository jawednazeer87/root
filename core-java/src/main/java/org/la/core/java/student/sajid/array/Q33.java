package org.la.core.java.student.sajid.array;

public class Q33 {
//	33) wap to find the second smallest element in an array?
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,17,16,14,12};
		int temp;
		for(int i=0; i<a.length;i++) {
			for (int j = i + 1; j < a.length; j++) {
                if (a[i]>a[j]){
                 temp = a[i];
                 a[i]= a[j];
                 a[j]=temp;
                }
            }
			}
		System.out.println("Second Largest Number is: "+a[1]);
		
	}

}
