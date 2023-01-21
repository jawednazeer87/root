package org.jn.core.java.student.sayed.hassain.collection;

import java.util.HashMap;
import java.util.Map;

public class Program71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Red");
		map.put(2, "green");
		map.put(3, "yellow");
		map.put(4,"black");
		map.put(5, "blue");
		System.out.println(map);
		//remove all the mappings
		map.clear();
		System.out.println(map);
		//System.out.println(map.isEmpty());
	}

}
