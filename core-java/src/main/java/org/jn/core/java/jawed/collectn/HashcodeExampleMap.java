package org.jn.core.java.jawed.collectn;

import java.util.LinkedHashMap;
import java.util.Map;

import org.jn.core.java.jawed.clss.model.HashcodeMap;

public class HashcodeExampleMap {

	public static void main(String[] args) {
		HashcodeMap hashcodeMap1 = new HashcodeMap(1, "amit");
		HashcodeMap hashcodeMap2 = new HashcodeMap(2, "ishtiaq");
		HashcodeMap hashcodeMap3 = new HashcodeMap(3, "altamash");
		HashcodeMap hashcodeMap4 = new HashcodeMap(4, "shoib");
		HashcodeMap hashcodeMap5 = new HashcodeMap(5, "five");
		HashcodeMap hashcodeMap6 = new HashcodeMap(6, "six");
		HashcodeMap hashcodeMap7 = new HashcodeMap(7, "seven");
		
		Map<HashcodeMap, Integer> map = new LinkedHashMap<>();
		map.put(hashcodeMap1, 1);
		map.put(hashcodeMap2, 2);
		map.put(hashcodeMap3, 13);
		map.put(hashcodeMap4, 4);
		map.put(hashcodeMap5, 555);
		map.put(hashcodeMap6, 6);
		map.put(hashcodeMap7, 70);
		hashcodeMap4.setName("Shoib");
//		System.out.println(map);
		System.out.println("hashcodeMap1: " + map.get(hashcodeMap1));
		System.out.println("hashcodeMap2: " + map.get(hashcodeMap2));
		System.out.println("hashcodeMap3: " + map.get(hashcodeMap3));
		System.out.println("hashcodeMap4: " + map.get(hashcodeMap4));
		System.out.println("hashcodeMap5: " + map.get(hashcodeMap5));
		System.out.println("hashcodeMap6: " + map.get(hashcodeMap6));
		System.out.println("hashcodeMap7: " + map.get(hashcodeMap7));
	}
}
