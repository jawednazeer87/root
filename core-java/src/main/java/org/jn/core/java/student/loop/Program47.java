package org.jn.core.java.student.loop;

public class Program47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int sum=0;
		int remainder=0;
		while(n!=0)
		{
			remainder=n%10;
			sum+=remainder;
			n=n/10;
		}
	}

}
