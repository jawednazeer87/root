package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.HashMap;

public class CharacterIntegerHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		map.put('a',2);
		map.put('b', 3);
		map.put('b', 4);
		map.put('d', 6);
		map.put('3', 7);
		map.put('4', 9);
		
		System.out.println(map);
	}

}
