package org.jn.core.java.student.azhan.operators.ifelse;

public class Problem53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99;
		if(num>0)
		{
			if(num>=10 && num<100)
				System.out.println("Number is positive and double digit");
			else if(num>=0 && num<10)
				System.out.println("Number is positive and single digit");
		}
		else
			System.out.println("Number is non-positive");
	}

}
