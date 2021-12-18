package org.la.core.java.student.sajid.looping.assignment4;

public class Wap26 {

	public static void main(String[] args) {
		int startNum = 200;
		int endNum = 1;
		
		for(int i=startNum;i>=endNum;i--) {
			
			int rem1=i%13;
			int rem2=i%2;
			
			if(rem1==0 && rem2==0) {
				System.out.print(" "+i);
			}
		}

	}

}
