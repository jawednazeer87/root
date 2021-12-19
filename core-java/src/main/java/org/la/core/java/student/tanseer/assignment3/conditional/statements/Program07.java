package org.la.core.java.student.tanseer.assignment3.conditional.statements;

public class Program07 {

	public static void main(String[] args) 
	{
		int a = 10 , b = 3 , c = 25 ;
		if ((a > b) && (a > c)) {
			System.out.println(" A is greatest : " +a);
		} 
		else if((b > a) && (b > c))
		{
			System.out.println(" B is greatest : " +b);
		}
		else if((c > a) && (c > b)) 
		{
			System.out.println(" C is greatest : " +c);
		}
	}

}
