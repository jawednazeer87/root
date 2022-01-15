package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 
	53)	wap to find whether an array of characters having 'a' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
		Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'
 */
public class Example53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {'A', '5', '7', 'p'};
		boolean array=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a') {
				array=true;
				break;
			}
			else {
				array=false;
			}
		}
		if(array==true) {
			System.out.println("this array has 'a'");
		}else {
			System.out.println("this array doesn't has 'a'");
		}
	}
}
