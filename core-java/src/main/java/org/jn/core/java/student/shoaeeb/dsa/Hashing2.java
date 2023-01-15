package org.jn.core.java.student.shoaeeb.dsa;

import java.util.*;
import java.util.Map.Entry;
public class Hashing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//country,population
		HashMap<String,Integer> map = new HashMap<>();
		//insertion
		map.put("india", 120);
		map.put("us", 30);
		map.put("China", 150);

		
		//HashMap are unordered;
		System.out.println(map);
		
		map.put("China", 180);
		//value corresponding to the key
		//will be updated
		
		
		//search
		if(map.containsKey("india"))
		{
			System.out.println("present in the map");
		}
		else {
			System.out.println("not present");
		}
		
		//get function get the value of the corresponding value
		System.out.println(map.get("india"));
		System.out.println(map.get("indonesia"));
		
		//iterator in HashMap
//		for(Map.Entry<String,Integer> e:map.entrySet())
//		{
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
//		
//		Set<String> keys =map.keySet();
//		
//		for(String key: keys)
//		{
//			System.out.println(key+" "+map.get(key));
//		}
		
		map.remove("china");//remove the pair in the hashmap
		
		for(Map.Entry<String, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
