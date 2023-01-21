package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashMap;
import java.util.Map;

public class Program25 {
//25.	Create a map of key char and value int
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		map.put('A', 65);
		map.put('B', 66);
		map.put('C', 67);
		map.put('D', 68);
		
		for(Map.Entry<Character, Integer> e: map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
