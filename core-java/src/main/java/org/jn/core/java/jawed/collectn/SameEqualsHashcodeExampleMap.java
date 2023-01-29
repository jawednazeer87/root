package org.jn.core.java.jawed.collectn;

import java.util.LinkedHashMap;
import java.util.Map;

import org.jn.core.java.jawed.clss.model.SameEqualsHashcodeMap;

public class SameEqualsHashcodeExampleMap {

	public static void main(String[] args) {
		SameEqualsHashcodeMap hashcodeMap1 = new SameEqualsHashcodeMap(1, "amit", true);
		SameEqualsHashcodeMap hashcodeMap2 = new SameEqualsHashcodeMap(2, "ishtiaq", true);
		SameEqualsHashcodeMap hashcodeMap3 = new SameEqualsHashcodeMap(3, "altamash", true);
		SameEqualsHashcodeMap hashcodeMap4 = new SameEqualsHashcodeMap(4, "saima", false);
		SameEqualsHashcodeMap hashcodeMap5 = new SameEqualsHashcodeMap(5, "naima", false);
		SameEqualsHashcodeMap hashcodeMap6 = new SameEqualsHashcodeMap(6, "female", false);
		SameEqualsHashcodeMap hashcodeMap7 = new SameEqualsHashcodeMap(7, "name", false);
		
		Map<SameEqualsHashcodeMap, Integer> map = new LinkedHashMap<>();
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
