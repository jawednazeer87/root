package org.jn.core.java.student.mirza.baig.method;

public class OddNumber {

	static void oddNumber (int [] arr) {
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i]%2!=0)
				
				System.out.println(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] arr = {1,2,3,4,5,6,7,8,9,10};
		 
		 
		 oddNumber(arr);
	}

}
