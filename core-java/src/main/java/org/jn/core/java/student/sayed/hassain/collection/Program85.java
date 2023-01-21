package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("black");
		colors.add("green");
		colors.add("yellow");
		System.out.println("before reverse:");
		System.out.println(colors);
		//
		Collections.reverse(colors);
		
		System.out.println("After reverse: ");
		System.out.println(colors);
	}

}
