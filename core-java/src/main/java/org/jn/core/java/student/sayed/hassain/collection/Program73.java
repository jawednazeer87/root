package org.jn.core.java.student.sayed.hassain.collection;

import java.util.HashMap;
import java.util.Map;

public class Program73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"Red");
		map.put(2, "Green");
		map.put(3, "Yellow");
		map.put(4, "Black");
		HashMap<Integer,String> newMap = new HashMap<>();
		newMap = (HashMap)map.clone(); 
		System.out.println(newMap);
		
	}

}
