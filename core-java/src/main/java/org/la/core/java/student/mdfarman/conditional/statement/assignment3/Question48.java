package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question48 {

	public static void main(String[] args) {

//		48. wap to find least number among three numbers
		
		int num1 = 145 , num2 = 66, num3= 144;
		
		int check = (num1<num2 && num1<num3)?num1:(num2<num3)?num2:num3;
				
		System.out.println(check);
		        
	}

}
