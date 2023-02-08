package org.jn.core.java.student.Sahil;

import java.util.HashMap;
import java.util.Map;

public class map {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap();
	map.put("SAHIL", 00);
	map.put("HAIDER", 9);
	map.put("MD", 6);
	for(Map.Entry<String, Integer> es:map.entrySet()) {
		System.out.println("   KEY , "+ es.getKey()+"  VALUE  , "+es.getValue() );
	}
		
}
}
