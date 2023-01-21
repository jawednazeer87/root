package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;

public class Program80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors=  new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("black");
		
		System.out.println(colors);
		
		//changing at position 0
		colors.set(0, "cyan");
		System.out.println(colors);
	}

}
