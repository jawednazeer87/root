package org.la.core.java.student.mdfarman.method.assignment6;


public class Question1 {

//	void printNegative(int[])
//	method will print all negative number from supplied array
	
	void printNegative(int arr[]) {
		for(int i:arr) {
			if (i<0){
                System.out.println(i);
            }
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,-3,4,-5,6,7,-8,9};
		Question1 obj = new Question1();
		obj.printNegative(arr);
				
	}
	
}
