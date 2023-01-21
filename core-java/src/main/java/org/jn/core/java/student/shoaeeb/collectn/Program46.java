package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> tmap = new TreeMap<>();
		//putting values in tree
		tmap.put(155, "shoaeeb");
		tmap.put(145, "suraiya");
		tmap.put(151,"sumaiya");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a key to search");
		int search=sc.nextInt();
		boolean key=false;
		for(Map.Entry<Integer, String> e: tmap.entrySet())
		{
			if(e.getKey()==search)
			{
				System.out.println("key present"+" value: "+e.getValue());
				key=true;
				break;
			}
			
		}
		if(!key)
		{
		 System.out.println("not found");
		}
	}

}
