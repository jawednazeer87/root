package org.la.core.java.student.mdfarman.method.assignment6;


public class Question3 {

//	void printEven(int[])
//	method will print all even number from supplied array
	
	void printEven(int arr[]) {
		for(int i:arr) {
			if (i%2==0){
                System.out.println(i);
            }
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,-3,4,-5,6,7,-8,9};
		Question3 obj = new Question3();
		obj.printEven(arr);
				
	}
	
}
