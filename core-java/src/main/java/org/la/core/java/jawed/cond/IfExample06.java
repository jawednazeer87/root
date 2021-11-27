package org.la.core.java.jawed.cond;

public class IfExample06 {

	public static void main(String[] args) {

		char vehicle = 'y';
		char type = 'm';
		
		System.out.println("Program started");
		
		if(vehicle=='y') {
			
			System.out.println("It is vehicle");
			
			if(type=='b') {
				System.out.println("it is bus");
			}
			if(type=='c') {
				System.out.println("it is car");
			}
			if(type=='m') {
				System.out.println("it is motor bike");
			}
			
		}
		else {
			System.out.println("it is not a vehicle");
		}
		
	}

}