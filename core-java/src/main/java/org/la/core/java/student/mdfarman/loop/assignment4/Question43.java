package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question43 {
	
//	43.	wap to reverse a number e.g ip=12345, op=54321 avoid zero
	
	public static void main(String[] args) {
		
		int num = 12345, rev = 0;
		
		while(num!=0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println(rev);
		
	}
}
