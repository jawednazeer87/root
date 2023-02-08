package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> ht = new Hashtable<>();
		
		ht.put("Ajay", 50);
		ht.put("Sachin", 77);
		ht.put("Gavaskar", 44);
		ht.put("Kapil", 60);
		ht.put("Dhoni", 88);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name to search:  ");
		String name=br.readLine();
		
		if(ht.containsKey(name))
		{
			int score=ht.get(name);
			System.out.println(score);
		}
		else {
			System.out.println("player not found");
		}
		
		
		System.out.println("Players in the table");
		
		//enumerations iterator
		Enumeration e = ht.keys();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}

}
