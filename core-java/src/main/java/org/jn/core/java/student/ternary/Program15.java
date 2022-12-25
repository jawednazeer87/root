package org.jn.core.java.student.ternary;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=65;
		if(res>80)
		{
			System.out.println("Grade: A");
		}
		else if(res>=60 && res<=80)
		{
			System.out.println("Grade: B");
		}
		else if(res>=50 && res<=60)
		{
			System.out.println("Grade : C");
		}
		else if(res>=45 && res<=50)
		{
			System.out.println("Grade : D");
		}
		else if(res>=25 && res<=45)
		{
			System.out.println("Grade : E");
		}
		else {
			System.out.println("Fail");
		}
	}

}
