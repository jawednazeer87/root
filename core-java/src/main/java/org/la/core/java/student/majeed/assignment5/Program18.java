package org.la.core.java.student.majeed.assignment5;

public class Program18 {

	public static void main(String[] args) {
		//18) wap to add two array elements n copy into third array
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = new int[arr1.length+arr2.length];
		int j=1;
		for(int i=0; i<arr1.length;i++) {
			arr1[i] = j;
			j += 1;
			System.out.println("arr1["+i+"]= "+arr1[i]);
		}
		int m=11;
		for(int k=0; k<arr2.length;k++) {
			arr2[k] = m;
			m += 1;
			System.out.println("arr2["+k+"]= "+arr2[k]);
		}
		int p=0; 
		while(p<arr1.length) {
			arr3[p] = arr1[p]+arr2[0];
			System.out.println("arr3["+p+"]= "+arr3[p]);
			p++;
		}		
	}

}
