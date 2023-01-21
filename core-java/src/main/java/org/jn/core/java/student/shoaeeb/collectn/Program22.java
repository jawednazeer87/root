package org.jn.core.java.student.shoaeeb.collectn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		map.put("Andhra Pradesh", "Amaravati");
		map.put("Assam", "Dispur");
		map.put("Bihar", "patna");
		map.put("Goa", "panaji");
		
		for(Map.Entry<String, String> e: map.entrySet())
		{
			System.out.println(e.getKey()+ ": "+e.getValue() );
		}
		
		Set<String> keys = map.keySet();
		
		for(String key: keys)
		{
			System.out.println(key + ":"+map.get(key));
		}
	}

}
