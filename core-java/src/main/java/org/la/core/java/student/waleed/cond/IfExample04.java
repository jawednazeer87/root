package org.la.core.java.student.waleed.cond;

public class IfExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  int per = 91;
		
		System.out.println("Program to check student grade");
		
		if(per>=90) {
			System.out.println("1st");
		}
		
		if(per>=80 && per<90) {
			System.out.println("2nd");
		}
		
		if(per>=70 && per<=80) {
			System.out.println("3rd");
		}
		
		if(per<40) {
			System.out.println("fail");
		}
		
		System.out.println("end");
		
		
		

	}

}
