package org.jn.core.java.student.mirza.baig.method;

public class NumberEven {

	
	public static void evenNumber(int [] array) {
		
		for (int i=1; i<array.length; i++) {
			
			if (array[i]%2==0)
			
			System.out.print(array[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		evenNumber(array);

	}

}
