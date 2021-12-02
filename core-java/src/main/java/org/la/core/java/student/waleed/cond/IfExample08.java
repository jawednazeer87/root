package org.la.core.java.student.waleed.cond;

public class IfExample08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    int per = 69;
		
		System.out.println("Program to check student grade");
		
		if(per>=90) {
			System.out.println("1st");
		}
		else {
			
			if(per>=80) {
				System.out.println("2nd");
			}
			else {
				
				if(per>=70) {
					System.out.println("3rd");
				}
				else { 
					if(per>=50 && per<70 ) {
						System.out.println( "Passed");
					}
					else {
					System.out.println("fail");
				}
				}
			}
		}
		
		System.out.println("end");
		
		
	}

}
