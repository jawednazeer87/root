package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class Program88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("pears");
		fruits.add("guava");
		fruits.add("orange");
		fruits.add("watermelon");
		List<String>newFruits = new ArrayList<>(fruits);
		
		boolean isEqual = fruits.equals(newFruits);
		System.out.println(isEqual);
		
		newFruits.add("apple");
		 isEqual = fruits.equals(newFruits);
		System.out.println(isEqual);
		
	}

}
