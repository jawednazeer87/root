package org.la.core.java.student.tanseer.assignment8.main.classes;

import org.la.core.java.student.tanseer.assignment8.classes.PrimeNumber;

public class PrimeNumberMain 
{
	public static void main(String[] args) 
	{
		PrimeNumber primenumber = new PrimeNumber();
		primenumber.setNum(26);
		boolean p = primenumber.primeNumber();
		System.out.println(primenumber.getNum()+" The entered number prime or not (True / False ) "+p);
	}
}
