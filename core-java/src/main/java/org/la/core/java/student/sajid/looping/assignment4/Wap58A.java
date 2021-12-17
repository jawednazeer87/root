package org.la.core.java.student.sajid.looping.assignment4;

public class Wap58A {
	

	public static void main(String[] args) {
		int givenNum = 123456;
		int firstDig;
		int lastDig;
		int tmp = givenNum;
		int swapNum;
		int c,d,r=0;
	
		System.out.println("Given Num is: "+tmp);
		lastDig = givenNum%10;
		System.out.println("last digit is: "+lastDig);
		
		while(givenNum > 10) {
			givenNum =  givenNum/10;			
		}
		firstDig = givenNum;
		System.out.println("first digit is: "+firstDig);
		
		
		givenNum = tmp/10; //12345
		while(givenNum>10) { //5432
			c = givenNum%10;
			r = r*10+c;
			givenNum =givenNum/10;						
		}
		swapNum = lastDig;
		
		while(r>0) {
			d = r%10;
			swapNum = swapNum * 10 + d;
			r = r/10;		
		}
		swapNum = swapNum * 10 + firstDig;
		System.out.println("After swapping first and last digit: "+swapNum);

	}

}
