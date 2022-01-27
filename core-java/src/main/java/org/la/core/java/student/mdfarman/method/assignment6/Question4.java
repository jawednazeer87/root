package org.la.core.java.student.mdfarman.method.assignment6;


public class Question4 {

//	void printOdd(int[])
//	method will print all odd number from supplied array
	
	void printOdd(int arr[]) {
		for(int i:arr) {
			if (i%2!=0){
                System.out.println(i);
            }
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,-3,4,-5,6,7,-8,9};
		Question4 obj = new Question4();
		obj.printOdd(arr);
				
	}
	
}
