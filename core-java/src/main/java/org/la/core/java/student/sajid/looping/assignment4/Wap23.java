package org.la.core.java.student.sajid.looping.assignment4;

public class Wap23 {

	public static void main(String[] args) {
		int startNum = 10;
		int endNum = 50;
		
		for(int i=startNum;i<=endNum;i++) {
			
			int rem1=i%5;
			int rem2=i%9;
			
			if(rem1==0 && rem2==0) {
				System.out.print(" "+i);
			}
		}

	}

}
