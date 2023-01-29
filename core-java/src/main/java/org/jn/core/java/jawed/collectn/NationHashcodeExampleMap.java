package org.jn.core.java.jawed.collectn;

import java.util.LinkedHashMap;
import java.util.Map;

import org.jn.core.java.jawed.clss.model.SameHashcodeNation;

public class NationHashcodeExampleMap {

	public static void main(String[] args) {
		SameHashcodeNation hashcodeMap1 = new SameHashcodeNation(1, "India");
		SameHashcodeNation hashcodeMap2 = new SameHashcodeNation(2, "Bangladesh");
		SameHashcodeNation hashcodeMap3 = new SameHashcodeNation(3, "Singapore");
		SameHashcodeNation hashcodeMap4 = new SameHashcodeNation(4, "Nepal");
		SameHashcodeNation hashcodeMap5 = new SameHashcodeNation(5, "Butan");
		SameHashcodeNation hashcodeMap6 = new SameHashcodeNation(6, "SA");
		SameHashcodeNation hashcodeMap7 = new SameHashcodeNation(7, "NZ");
		
		Map<SameHashcodeNation, Integer> map = new LinkedHashMap<>();
		map.put(hashcodeMap1, 1);
		map.put(hashcodeMap2, 2);
		map.put(hashcodeMap3, 13);
		map.put(hashcodeMap4, 4);
		map.put(hashcodeMap5, 555);
		map.put(hashcodeMap6, 6);
		map.put(hashcodeMap7, 70);
		System.out.println(map);
	}
}
