package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class Program90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits  = new ArrayList<>();
		fruits.add("orange");
		fruits.add("orange");
		fruits.add("guava");
		fruits.add("watermelon");
		
		List<String> moreFruits = new ArrayList<>();
		moreFruits.add("grapes");
		moreFruits.add("apple");
		moreFruits.add("mango");
		
		System.out.println("Fruits List");
		System.out.println(fruits);
		
		System.out.println("more fruits");
		System.out.println(moreFruits);
		
		fruits.addAll(moreFruits);
		
		System.out.println(fruits);
		
	}

}
