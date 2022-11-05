package org.jn.core.java.student.ternary;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage=80;
		if(percentage>=80)
		{
			System.out.println("Distinction");
		}
		else if(percentage>=65 && percentage<=80)
		{
			System.out.println("1st Division");
		}
		else if(percentage>=50 && percentage<=65)
		{
			System.out.println("2nd Division");
		}
		else if(percentage>=35 && percentage<=50)
		{
			System.out.println("3rd Division");
		}
		//less than 33% is fail
		else {
			System.out.println("fail");
		}
	}

}
