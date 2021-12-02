package org.la.core.java.student.waleed.homework.assignment3;

public class Assign08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    int a = 49;
		
		System.out.println("Program to check student division");
		
		if(a>=80) {
			System.out.println("1st");
		}
		else
		{
			
			if(a>=70) {
				System.out.println("2nd");
			}
			else {
				
				if(a>=60) {
					System.out.println("3rd");
				}
				else { 
					if(a>=50 && a<60 ) 
					{
						System.out.println( "Passed");
					}
					else
					{
					System.out.println("fail");
				}
				}
			}
		}
		
		System.out.println("end");
		
	}

}
