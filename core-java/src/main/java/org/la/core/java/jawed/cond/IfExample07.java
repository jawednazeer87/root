package org.la.core.java.jawed.cond;

public class IfExample07 {

	public static void main(String[] args) {

		char vehicle = 'y';
		char type = 'm';
		
		System.out.println("Program started");
		
		if(vehicle=='y') {
			
			System.out.println("It is vehicle");
			
			if(type=='b') {
				System.out.println("it is bus");
			}
			else {
				if(type=='c') {
					System.out.println("it is car");
				}
				else {
					System.out.println("it is motor bike");
				}
			}
			
		}
		else {
			System.out.println("it is not a vehicle");
		}
		
	}

}