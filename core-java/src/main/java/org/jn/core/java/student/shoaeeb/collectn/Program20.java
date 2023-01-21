package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		map.put(155, 20);
		map.put(151, 22);
		map.put(145, 18);
		
		for(Map.Entry<Integer, Integer> e: map.entrySet())
		{
			System.out.println(e.getKey()+": "+e.getValue());
			
		}
		
		Set<Integer> keys = map.keySet();
		
		for(int key:keys)
		{
			System.out.println(key+": "+map.get(key));
		}
		
	}

}
