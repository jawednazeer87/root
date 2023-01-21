package org.jn.core.java.student.sayed.hassain.collection;

import java.util.HashMap;
import java.util.Map;

public class Program23 {
	//23.	Create a map of key String and value int
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		map.put("india", 150);
		map.put("china" , 200);
		map.put("us", 30);
		
		for(Map.Entry<String, Integer> e: map.entrySet())
		{
			System.out.println(e.getKey()+ " : "+e.getValue());
		}
	}

}
