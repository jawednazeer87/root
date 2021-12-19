package org.la.core.java.student.sajid.looping.assignment4;

public class Wap61 {

	public static void main(String[] args) {
		int givenNum = 123456;
		int rvrsNum=0,tmp;
		
		while(givenNum > 0) {
			tmp = givenNum%10;
			
			rvrsNum = rvrsNum * 10 + tmp;
			givenNum = givenNum/10;
		}
		System.out.println("Reverse of given number: "+rvrsNum);

	}

}
