package org.jn.core.java.student.shoaeeb.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FeesMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of a course: CSE or ECE");
		String name=br.readLine();
		Fees f = CourseFees.getFees(name);
		System.out.println("Fees "+f.showFees());
	}

}
