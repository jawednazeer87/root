package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program24 {
//24.	Create a map of key int and value char
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Character> map = new HashMap<>();
		map.put(65, 'A');
		map.put(66, 'B');
		map.put(67, 'C');
		map.put(68, 'D');
		
		for(Map.Entry<Integer, Character> e: map.entrySet())
		{
			System.out.println(e.getKey()+ ": "+e.getValue());
		}
		
		Set<Integer> keys = map.keySet();
		
	}

}
