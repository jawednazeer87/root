package org.jn.core.java.student.ternary;

public class Program48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=7;
		int c=8;
		if(a>b && a>c)
		{
			System.out.println(a+" is greater than "+b+ " and"+c);
		}
		else if(b>c)
		{
			System.out.println(b+" is greater than "+c+ " and"+a);
		}
		else {
			System.out.println(c+" is greater than "+a+ " and "+b);

		}
	}

}
