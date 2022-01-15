package org.la.core.java.student.sajid.array;

public class Q27 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7};
		int specificValue = 6, i, indexValue = 0;
		boolean yes = false;
		for(i=0; i<arr1.length;i++) {
			if(arr1[i] == specificValue) {
				yes = true;
				indexValue = i;
				break;
			}
		}	if(yes == false) {
			System.out.println(-1);
		}else 
			System.out.println("Index Value is: "+indexValue);

	}

}
