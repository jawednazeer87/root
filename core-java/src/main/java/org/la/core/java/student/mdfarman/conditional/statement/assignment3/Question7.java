package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question7 {

	public static void main(String[] args) {
//		7.	wap to find to find greatest among three numbers
		int num1 = 10, num2 = 20, num3  = 30;
		if(num1>num2 && num1>num3)
			System.out.println(num1+" is greatest");
		else if (num2>num3)
			System.out.println(num2+" is greatest");
		else
			System.out.println(num3+" is greatest");

	}

}
