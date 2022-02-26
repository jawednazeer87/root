package org.la.core.java.jawed.colectin;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jawednazeer
 *
 */
public class MapMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "jain");
		map.put("id", "1234");
		map.put("email", "jain@mail.com");
		String val = map.get("id");
		System.out.println("val: "+val);
		val = map.get("idd");
		System.out.println("val: "+val);
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
		}
	}
}
