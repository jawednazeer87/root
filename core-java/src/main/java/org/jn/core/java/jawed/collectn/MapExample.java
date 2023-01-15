package org.jn.core.java.jawed.collectn;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Friday", 1);
		map.put("Saturday", 2);
		map.put("Sunday", 3);
		for (Map.Entry<String, Integer> es: map.entrySet()) {
			System.out.println("key: " + es.getKey() + ", value: " + es.getValue());
		}
		System.out.println("\n\n");
		for (String keySet: map.keySet()) {
			System.out.println("key: " + keySet + ", value: " + map.get(keySet));
		}
		System.out.println("\n\nvalues only");
		for (int i: map.values()) {
			System.out.println("value: " + i);
		}
	}
}
