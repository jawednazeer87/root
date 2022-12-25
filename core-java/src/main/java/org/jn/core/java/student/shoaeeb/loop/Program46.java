package org.jn.core.java.student.shoaeeb.loop;

public class Program46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int reverseNum=0;
		int originalNum = n;
		int remainder;
		while(n!=0)
		{
			remainder=n%10;
			 reverseNum=reverseNum*10+remainder;
			n=n/10;
		}
		
		System.out.println(reverseNum);
	}

}
