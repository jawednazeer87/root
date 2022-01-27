package org.la.core.java.student.mdfarman.method.assignment6;


public class Question2 {

//	void printPositive(int[])
//	method will print all positive number from supplied array
	
	void printPositive(int arr[]) {
		for(int i:arr) {
			if (i>0){
                System.out.println(i);
            }
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,-3,4,-5,6,7,-8,9};
		Question2 obj = new Question2();
		obj.printPositive(arr);
				
	}
	
}
