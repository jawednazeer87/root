package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to print number divisible by given number from an array
 */
public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int[] b= {5,2,8,3,2,5,4,5,1,2};
		for(int i=0;i<b.length;i++) {
			if(b[i]%a==0) {
				System.out.println("b["+i+"] "+b[i]);
			}
		}
		
	}

}
