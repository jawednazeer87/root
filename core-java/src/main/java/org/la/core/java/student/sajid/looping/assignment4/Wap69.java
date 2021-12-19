package org.la.core.java.student.sajid.looping.assignment4;

public class Wap69 {

	public static void main(String[] args) {
		int givenNum = 8209;
		int n = givenNum;
		int dispNum = givenNum;
		int temp;
		int amstrngNum = 0;
		int count=0;
		
		for(;n>0;) {
			n = n/10;
			count++;	//to get number of digits from given number					
		}
		
		
		while(givenNum>0) {
			
			temp = givenNum%10;
			
			amstrngNum +=  (Math.pow(temp, count)); // 8pow4 + 2pow4 + 0pow4 + 8pow4
			
			givenNum = givenNum/10;
		}
		
		 if(amstrngNum == dispNum) {
	            System.out.println(dispNum + " is an Armstrong number");
		 }else {
	            System.out.println(dispNum + " is not an Armstrong number");
		 }

	}

}
