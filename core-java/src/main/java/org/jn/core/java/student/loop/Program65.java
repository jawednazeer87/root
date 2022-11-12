package org.jn.core.java.student.loop;

public class Program65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=153;
		int originalNum = number;
		int remainder;
		int armstrong=0;
		while(number!=0)
		{
			remainder=number%10;
			armstrong=armstrong + (remainder*remainder*remainder);
			number=number/10;
		}
		
		if(originalNum==number)
		{
			System.out.println("Yes. It is a armstrong number");
		}
		else {
			System.out.println("No it is not an armstrong number");
		}
	}

}
