package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	//4.	Convert char array to char list 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'a','d','c','b','s','t','u','v','w','x','y','z'};
		List<Character> list = new ArrayList<>();
		for(char ch : c)
		{
			list.add(ch);
		}
		
		//printing the list
		for(char ch: list)
		{
			System.out.print(ch+" ");
		}
		
	}

}
