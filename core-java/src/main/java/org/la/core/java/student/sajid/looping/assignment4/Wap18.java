package org.la.core.java.student.sajid.looping.assignment4;

public class Wap18 {

	public static void main(String[] args) {
		int startNum = 130;
		int endNum = 90;
		
		for(int i=startNum;i>=endNum;i--) {
			
			int rem=i%10;
			
			if(rem!=0) {
				System.out.print(" "+i);
			}
			
		}

	}

}
