package org.la.core.java.student.sajid.looping.assignment4;

public class Wap17 {

	public static void main(String[] args) {
		int startNum = 30;
		int endNum = 50;
		
		for(int i=startNum;i<=endNum;i++) {
			
			int rem=i%7;
			
			if(rem!=0) {
				System.out.print(" "+i);
			}
			
		}

	}

}
