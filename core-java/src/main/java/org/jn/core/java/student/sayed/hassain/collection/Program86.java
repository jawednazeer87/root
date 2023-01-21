package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class Program86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//extract a portion of list
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("black");
		colors.add("green");
		colors.add("yellow");
		System.out.println(colors);
		List<String> subColors = new ArrayList<>();
		subColors=colors.subList(0, 3);
		System.out.println(subColors);

	}

}
