package org.la.core.java.student.sajid.looping.assignment4;

public class Wap19 {

	public static void main(String[] args) {
		int startNum = 30;
		int endNum = 80;
		
		for(int i=startNum;i<=endNum;i++) {
			
			int rem1=i%5;
			int rem2=i%6;
			
			if(rem1==0 && rem2==0) {
				System.out.print(" "+i);
			}
		}

	}

}
