package org.jn.core.java.student.shoaeeb.linearsearch;

public class CountEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {18,12,6,999,534,1,35};
		int count=0;
		for(int number: arr)
		{
			if(even(number))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean even(int number)
	{
		int numberOfDigits=digits(number);
		return numberOfDigits%2==0;
	}
	static int digits(int n)
	{
		return (int)(Math.log10(n))+1;
	}

}
