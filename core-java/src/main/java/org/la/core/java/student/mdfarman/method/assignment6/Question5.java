package org.la.core.java.student.mdfarman.method.assignment6;


public class Question5 {

//	void printNum(int[], int)
//	method will print number if found in array negative number from supplied array
//	e.g. if a[]={1,2,3} n b=2 then print 2
//	if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element
	
	
	void printNum(int arr[], int n) {
		boolean flag = false;
		for(int i:arr) {
			if (i==n){
				flag = true;
                System.out.println(i);
                break;
            }
		}
		if(flag == false) {
			System.out.println("Not found");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int n =2;
		int n2=5;
		Question5 obj = new Question5();
		obj.printNum(arr,n);
		obj.printNum(arr,n2);
				
	}
	
}
