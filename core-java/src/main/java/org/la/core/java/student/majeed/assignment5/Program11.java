package org.la.core.java.student.majeed.assignment5;

public class Program11 {

	public static void main(String[] args) {
		//11) wap to copy one array into other array
		
		int[] arr = new int[20];
		int[] copyArr;
		int j=1;
		for(int i=0; i<arr.length;i++) {
			arr[i] = j;
			j += 1;
		}
		copyArr = arr;
		for(int k=0; k<copyArr.length;k++) {
			System.out.println("arr["+k+"]= "+arr[k]);
		}
	}

}
