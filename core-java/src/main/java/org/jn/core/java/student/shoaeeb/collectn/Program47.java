package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program47 {
	//search a value in tree map
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> tmap = new TreeMap<>();
		tmap.put(155, "shoaeeb");
		tmap.put(145, "suraiya");
		tmap.put(151, "sumaiya");
		tmap.put(180, "aftab");
		tmap.put(160, "shizan");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to search");
		String search=sc.nextLine();
		boolean found=false;
		for(Map.Entry<Integer,String> e: tmap.entrySet())
		{
			if(search==e.getValue())
			{
				found=true;
				System.out.println("value is present Key: "+e.getKey());
				break;		
			}
		}
		if(!found)
		{
			System.out.println("value not found");
		}
	}

}
