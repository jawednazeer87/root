package org.la.core.java.student.sajid.looping.assignment4;

public class Wap16 {

	public static void main(String[] args) {
		int startNum = 120;
		int endNum = 100;
		
		for(int i=startNum;i>=endNum;i--) {
			
			int rem=i%3;
			
			if(rem==0) {
				System.out.print(" "+i);
			}
			
		}

	}

}
