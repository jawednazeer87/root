package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map  = new HashMap<>();
		map.put(65, "A");
		map.put(66, "B");
		map.put(67, "C");
		
		for(Map.Entry<Integer, String> e: map.entrySet())
		{
			System.out.println(e.getKey() + ": "+e.getValue());
		}
		
		System.out.println();
		Set<Integer> keys = map.keySet();
		
		for(int key: keys)
		{
			System.out.println(key + ": "+map.get(key));
		}
				
		
		
	}

}
