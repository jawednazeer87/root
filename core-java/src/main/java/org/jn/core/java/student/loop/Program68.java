package org.jn.core.java.student.loop;

public class Program68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		int n=10;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<=n; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		
	}

}
