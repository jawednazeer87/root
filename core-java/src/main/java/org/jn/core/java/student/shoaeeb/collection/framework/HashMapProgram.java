package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<String,Long> hm = new HashMap<>();
		int choice=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(choice<4)
		{
			System.out.println("1.Enter Phone Entries");
			System.out.println("2.Look Up in the book");
			System.out.println("3.Display names in the book");
			System.out.println("4.Exit");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				System.out.println("Enter name: ");
				String name = br.readLine();
				System.out.println("Enter number: ");
				long number = Long.parseLong(br.readLine());
				hm.put(name, number);
				break;
			case 2:
				System.out.println("Enter the name you want to search");
				name=br.readLine();
				System.out.println(hm.get(name));
				break;
			case 3:
					Set<String> set = hm.keySet();
					for(String s: set )
					{
						System.out.println(s);
					}
					break;
			default:
				return;			
			}
		}
	}

}
