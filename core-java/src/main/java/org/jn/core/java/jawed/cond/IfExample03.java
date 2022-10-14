package org.jn.core.java.jawed.cond;

public class IfExample03 {

	public static void main(String[] args) {
		char race = 'e';						//asian
		char location = 'm';
		System.out.println("Program started for checking race");
		
		if(race=='c' || race=='a') {
			System.out.println("Chinese Asian");
		}
		
		if( (race=='b' || race=='e') && location=='m') {
			System.out.println("British");
		}
		
		if(race=='a' && location=='m') {
			System.out.println("Arab");
		}
		
		System.out.println("race: "+race);
	}

}