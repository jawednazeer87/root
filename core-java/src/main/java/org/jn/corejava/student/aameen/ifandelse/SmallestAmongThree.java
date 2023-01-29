package org.jn.corejava.student.aameen.ifandelse;

public class SmallestAmongThree {

	public static void main(String[] args) {
		// wap to find smallest number among 3 numbers
		
		
		int num1 = 34 , num2 = 14 , num3 = 56 ;
		if((num1<num2)&& (num1<num3))
			System.out.println(" the smaller number among three is num1 : "+num1);
		else if((num2<num1)&& (num2<num3))
			System.out.println(" the smaller number among three is num2 : "+num2);
		else
			System.out.println(" the smaller number among three is num3 : "+num3);
		


	}

}
