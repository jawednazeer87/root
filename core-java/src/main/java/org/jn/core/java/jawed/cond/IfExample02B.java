package org.jn.core.java.jawed.cond;

public class IfExample02B {

	public static void main(String[] args) {
		char race = 'B';						//asian
		System.out.println("Program started for checking race");
		
		if(race=='a' || race=='A') {
			System.out.println("Asian");
		}
		
		if(race=='c' || race=='C') {
			System.out.println("Chinese");
		}
		
		if(race=='b' || race=='B') {
			System.out.println("British");
		}
		
		System.out.println("race: "+race);
	}

}