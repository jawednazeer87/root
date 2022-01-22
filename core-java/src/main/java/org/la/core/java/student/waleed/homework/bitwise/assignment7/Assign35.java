package org.la.core.java.student.waleed.homework.bitwise.assignment7;

public class Assign35 {

	public static void main(String[] args) {
		
		int n= 0x11; 
		// 0x11 in ddecimal = 17
		//
		//This is hexadecimal number
		//*
		//the 0X indicates that it is a hex number and that is the only purpose of 0X. 
		//Thus, to convert a hex number such as 0X11 to decimal if you want to do that, 
		//we only need to look at the symbols after 0X which are 11.
		//To convert the hex number 0X11 to decimal (or any other hexadecimal number for that matter), you follow these steps:

			//Step 1) Multiply the last digit by 1, Multiply the second to last digit by 16, 
		//Multiply the third to the last digit by 16 x 16, Multiply the fourth to the
		//last digit by 16 x 16 x 16, Multiply the fifth to the last digit by 16 x 16 x 16 x 16 and so on until all the digits are used.

			//Step 2) Add up all the products you got from Step 1 to get the answer to 0X11 in decimal.
		//Here is the math  using the steps above showing you how to convert 0X11 to decimal.

		//1 x 1 = 1
		//1 x 16 = 16

		//1 + 16 = 17
		
		
		int res = 11 & 0x11;
		// 00001011 & 00010001 =00000001  = 1
		System.out.println("rest = " +res);
		System.out.println("n = " +n);
	}

}
