package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question12 {

	public static void main(String[] args) {
//			12.	wap to find smallest number among 3 numbers

		
		int num1 = 15, num2 = 7 , num3 = -45;
		if (num1<num2 && num1<num3)
			System.out.println(num1+" is smallest");
		
		else if (num2 < num3)
			System.out.println(num2+" is smallest");
		else
			System.out.println(num3+" is smallest");
        

	}

}
