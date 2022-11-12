package org.jn.core.java.student.loop;

public class Program60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1526;
		int product=1;
		while(n!=0)
		{
			int remainder = n%10;
			product*=remainder;
			n=n/10;
		}
		System.out.println(product);
	}

}
