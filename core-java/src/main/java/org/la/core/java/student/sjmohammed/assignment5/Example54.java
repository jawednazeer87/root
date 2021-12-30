package org.la.core.java.student.sjmohammed.assignment5;
/*
 * 54)	wap to find whether an array of characters having 'Z' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array doesn't have 'Z'
		Suppose given array is ['A', '5', 'Z', 'p'] -> this array has 'Z'
 */
public class Example54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {'A', '5', 'Z', 'p'};
		boolean array=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='Z') {
				array=true;
				break;
			}
			else {
				array=false;
			}
		}
		if(array==true) {
			System.out.println("this array has 'Z'");
		}else {
			System.out.println("this array doesn't has 'Z'");
		}
	}

}
