package org.la.core.java.student.sajid.looping.assignment4;

public class Wap30 {

	public static void main(String[] args) {
		int startNum = 1;
		int endNum = 150;
		
		for(int i=startNum;i<=endNum;i++) {
			
			int rem=i*11;
			
			if(rem<=endNum) {
				System.out.print(" "+rem);
			}
		}

	}

}
