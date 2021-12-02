package org.la.core.java.student.waleed.cond;

public class IfExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		char race = 'A';						
		char location = 'l';
		System.out.println("Program started for checking race");
		
		if(race=='c' || race=='a') {
			System.out.println("Chinese Asian");
		}
		
		if( (race=='b' || race=='e') && location=='m') {
			System.out.println("British");
		}
		
		if(race=='A' && location=='l') {
			System.out.println("Arab");
		}
		
		System.out.println("race: "+race);
	}

	}


