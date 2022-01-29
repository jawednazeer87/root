package org.la.core.java.student.sajid.method.assignment6;

public class Wap34 {

	public static void main(String[] args) {
		//34)	char[] reverse(char[] src)
	//reverse the same array and return.
		
		char c[] = {'a','b','c'};
		
		reverse(c);		
		
		for(char n:c) {
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