package org.la.core.java.student.hasan.assignment04;

public class Loop73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 145;
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
			//calculating factorial of r
			for(int i = r ; i >= 1 ; i--)
			fac = fac * i;
			//storing sum of factorial of all digits of the number
			sum = sum + fac;
			n=n/10;
		}
		//condition for strong number
		if(sum == number)
			System.out.println("Strong Number");//display the result
		else
			System.out.println("Not a Strong Number");
	}

}
