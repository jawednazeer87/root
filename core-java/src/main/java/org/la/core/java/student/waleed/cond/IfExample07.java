package org.la.core.java.student.waleed.cond;

public class IfExample07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char vehicle = 'y';
		char type = 'm';
		
		System.out.println("Program started");
		
		if(vehicle=='y') {
			
			System.out.println("It is vehicle");
			
			if(type=='b') {
				System.out.println("It is bus");
			}
			else {
			if(type=='c') {
				System.out.println("It is car");
			             }
			else {
				System.out.println("It is motor bike");
			     }
			
		                }
		             }
		else {
			System.out.println("It is not a vehicle");
		}
		
		
	}

}
