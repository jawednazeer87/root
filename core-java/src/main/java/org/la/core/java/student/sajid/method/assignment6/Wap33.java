package org.la.core.java.student.sajid.method.assignment6;

public class Wap33 {

	public static void main(String[] args) {
		// 33)	char[] reverse(char[] src)
		//create new array and copy the src array to new array in reverse order 
		
		char c[] = {'a','b','c'};
		
		char d[] = reverse(c);		
		
		for(char n:d) {
			System.out.println(n);
		}

	}
	
	static char[] reverse(char[] arr) {
		
		char e[] = new char[arr.length];
		
		int ctr = 0;
		
		for(int i=arr.length-1;i>=0;i--){
			e[ctr] = arr[i]; 
				ctr++;		
		}
		return e;

	}
}
