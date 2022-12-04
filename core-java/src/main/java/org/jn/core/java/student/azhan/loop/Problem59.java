package org.jn.core.java.student.azhan.loop;

public class Problem59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234, sum=0;
		while(num != 0)
		{
			sum = sum + num%10;
			num/=10;
		}
		System.out.println("Sum = "+sum);
	}

}
