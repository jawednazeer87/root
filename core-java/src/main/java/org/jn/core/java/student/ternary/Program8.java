package org.jn.core.java.student.ternary;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		int c=3;
		if(a>b)
		{
			if(a>c) {
				System.out.println(a+"is greatest among the three");
			}
		}
		else if (b>c)
		{
			System.out.println(b+" is greatest among the numbers");
		}
		else {
			System.out.println(c+" is greatest among the numbers");
		}
	}

}
