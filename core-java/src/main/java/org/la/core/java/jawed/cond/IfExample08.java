package org.la.core.java.jawed.cond;

public class IfExample08 {

	public static void main(String[] args) {

		int per = 69;
		
		System.out.println("Program to check student grade");
		
		if(per>=60) {
			System.out.println("1st");
		}
		else {
			
			if(per>=50) {
				System.out.println("2nd");
			}
			else {
				
				if(per>=40) {
					System.out.println("3rd");
				}
				else {
					System.out.println("fail");
				}
			}
		}
		
		System.out.println("end");
	}

}