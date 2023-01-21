package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//copy the content of one tree map
		//to another
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(5, "I");
		tmap.put(1, "asd");
		tmap.put(4, "yes");
		tmap.put(3, "pol");
		
		
//		for(Map.Entry<Integer, String> es: tmap.entrySet())
//		{
//			System.out.println(es.getKey()+": "+es.getValue());
//		}
//		Set<Integer> set = tmap.keySet();
		System.out.println("Original tree map: "+tmap );
		//clone map
		System.out.println("Clone map: "+tmap.clone());
	}

}
