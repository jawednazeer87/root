package org.jn.core.java.jawed.cond;

public class IfExample02 {

	public static void main(String[] args) {
		char race = 'a';						//asian
		System.out.println("Program started for checking race");
		if(race=='a') {
			System.out.println("Asian");
		}
		if(race=='c') {
			System.out.println("Chinese");
		}
		if(race=='b') {
			System.out.println("British");
		}
		System.out.println("race: "+race);
	}

}