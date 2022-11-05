package org.jn.core.java.student.ternary;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		String res = (a%2!=0)?"a is a odd number":"a is not a odd number";
		String res1 =((a|1)<a)?"a is odd number":"a is not a odd number";
		System.out.println(res);
		System.out.println(res1);
		
	}

}
