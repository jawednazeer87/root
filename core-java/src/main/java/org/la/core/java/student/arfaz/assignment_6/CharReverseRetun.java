package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
	
	char[] reverse(char[] src)
		reverse the same array and return.
*/

public class CharReverseRetun {
//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		char a[] = {'a','b','c','d'};
		char []b = reverse(a);
		for(char c:b)  {
			System.out.print(c+" ");
		}
		
	}
	static  char[] reverse(char a[]) {
		char []b = new char[a.length];
		int n= a.length;
		for(int i=0;i<a.length;i++)  {
			b[i] = a[n-1];
			n--;
		}
		return b;
		
	}
	
}
