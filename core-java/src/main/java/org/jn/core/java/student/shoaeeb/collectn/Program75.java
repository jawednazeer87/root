package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashMap;

public class Program75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"Red");
		map.put(2, "Green");
		map.put(3, "Yellow");
		map.put(4, "Black");
		System.out.println("Blue "+map.containsValue("Blue"));
		System.out.println("Black "+map.containsValue("Black"));

	}

}
