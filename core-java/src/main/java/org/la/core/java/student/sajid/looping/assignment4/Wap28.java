package org.la.core.java.student.sajid.looping.assignment4;

public class Wap28 {

	public static void main(String[] args) {
		int startNum = 10;
		int endNum = 300;
		
		for(int i=startNum;i<=endNum;i++) {
			
			int rem1=i%11;
			int rem2=i%12;
			
			if(rem1==0 && rem2==0) {
				System.out.print(" "+i);
			}
		}

	}

}
