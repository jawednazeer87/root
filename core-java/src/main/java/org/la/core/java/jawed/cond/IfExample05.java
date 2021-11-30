package org.la.core.java.jawed.cond;

public class IfExample05 {

	public static void main(String[] args) {

		int age = 29;
		System.out.println("Program started");
		
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
		
		System.out.println("age: "+age);
	}

}