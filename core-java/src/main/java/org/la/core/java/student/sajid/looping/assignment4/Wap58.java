package org.la.core.java.student.sajid.looping.assignment4;

public class Wap58 {

	public static void main(String[] args) {
		int givenNum = 1234;
		int dispNum = givenNum;
		int swapNum;
		int firstDig = 0;
		int lastDig = 0;
		int rem = 0;
		int c = 0;
		int r = 0;
		int d = 0;
		
		
		rem = givenNum%10;
		
		lastDig = rem; //print last digit of given number
		System.out.println("last digit is: "+lastDig);
		
		for(;givenNum>1;) {
						
			rem = givenNum%10;
			
			givenNum = givenNum/10;					
			
		}
		
		firstDig = givenNum; //print first digit of given number
		System.out.println("first digit is: "+firstDig);
		
		givenNum = dispNum/10; //exclude last digit from given number
		
		while(givenNum>10) { //by giving 10 instead of 0 , it will exclude first digit of given number
			c = givenNum%10;
			r = r*10+c;  // this will be used later for looping 
			givenNum = givenNum/10;
		}
		System.out.println("value: "+r); // print middle digits of given number. ex: 32
		swapNum = lastDig; // initializing final result with last digit of given number
		
		while(r>0) { // reverse the middle digits and include last digit 
						
			d=r%10; 
			swapNum = swapNum * 10 + d; //ex: 432 will change to 423 here
			r = r/10; 
		}
		swapNum = swapNum * 10 + firstDig; // multiply 423 * 10 = 4230 + 1 --> it will give 4231
		System.out.println("After Swap: "+swapNum);

	}

}
