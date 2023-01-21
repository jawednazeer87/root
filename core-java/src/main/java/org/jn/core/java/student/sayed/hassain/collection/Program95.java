package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;

public class Program95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<>();
		colors.add("green");
		colors.add("blue");
		colors.add("yellow");
		colors.add("black");
		colors.add("white");
		colors.ensureCapacity(3);
		System.out.println(colors);
	}

}
