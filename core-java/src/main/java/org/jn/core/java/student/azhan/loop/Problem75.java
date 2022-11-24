package org.jn.core.java.student.azhan.loop;

public class Problem75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1,c,n=10;
		System.out.println(a+"\n"+b);
		for(int i=1; i<=n-2; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
