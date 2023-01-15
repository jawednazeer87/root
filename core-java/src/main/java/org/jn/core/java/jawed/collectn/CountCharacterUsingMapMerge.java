package org.jn.core.java.jawed.collectn;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterUsingMapMerge {
	
	public static void main(String[] args) {
		String str = "dsafbdsa";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch: arr) {
			map.merge(ch, 1, (a, b) -> a+b);
		}
		System.out.println(map);
	}

}
