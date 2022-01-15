package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * double percent(int, int, int, int, int)
	suppose 5 arguments are marks in subjects, each subject is of 100 marks,
	find percentage and return result

 */
public class Program20Percentage 
{

	public static void main(String[] args) 
	{

		double ans = percent(50, 80, 86, 90, 67);
		System.out.println(ans);
	}
	
	static double percent(int n1, int n2, int n3, int n4, int n5)
	{
		double per;
		double sum = n1 + n2 + n3 + n4 + n5; 
		per = ( sum / 5);
		return per;
	}
}

