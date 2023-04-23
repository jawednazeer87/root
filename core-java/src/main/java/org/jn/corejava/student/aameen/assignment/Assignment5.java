package org.jn.corejava.student.aameen.assignment;

public class Assignment5 {

	public static void main(String[] args) {
		// Wap to create and print a char variable 15 times with 26 different char values.
		
		char times1 = 'A';
		char times2 = 'B';
		System.out.println("times1 :"+times1);
		System.out.println("times2 :"+times2);
		
		for(int i =1;i<=13;i++)
		{
			times2++;
			System.out.print(i+" : "+times2 +", "+ ++times2);
			System.out.println("");
			
		}
	}

}
