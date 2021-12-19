package org.la.core.java.student.sajid.looping.assignment4;

public class Wap62 {

	public static void main(String[] args) {
		int givenNum=122;
		int tmp = givenNum;
		int rvrsNum = 0;
		int rem;
		
		while(tmp>0) {
			rem = tmp%10;
			rvrsNum = rvrsNum*10+rem;
			tmp = tmp/10;
		}
		
		if(rvrsNum==givenNum) {
			System.out.println("Given Number: "+givenNum+" is palindrome");
		}else {
			System.out.println("Given Number: "+givenNum+" is not palindrome");
		}

	}

}
