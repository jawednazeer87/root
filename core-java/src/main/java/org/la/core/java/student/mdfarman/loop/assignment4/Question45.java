package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question45 {
	
//	44.	wap to find sum of a number e.g ip=1234,  op=10
	
	public static void main(String[] args) {
		
		int num = 1234 ; 
		int sum = 0 ;
		
		while(num!=0) {
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println(sum);
		
	}
}
