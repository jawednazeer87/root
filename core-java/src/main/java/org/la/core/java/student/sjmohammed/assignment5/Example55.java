package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 
	55) wap to print all ascii value of character array
		Suppose given array is ['a', '5', '7', 'p'] -> answer would be : 97, 53, 55, 112
 */
public class Example55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {'a', '5', '7', 'p'};
		for(int i=0;i<a.length;i++) {
			System.out.println("ASCII of "+(char)a[i]+" is "+a[i]);
		}
	}

}
