package org.jn.core.java.jawed.collectn;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterUsingMap {
	
	public static void main(String[] args) {
		String str = "dsafb7897sadjfh4342jsdhlfab97987dsjfhal";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch: arr) {
			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		System.out.println(map);
	}

}
