package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
	//5.	Convert char array to char list and but dont copy character 'a' to list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'a','d','c','b','s','t','u','v','w','x','y','z'};
		List<Character> list = new ArrayList<>();
		
		for(char character : c)
		{
			if(character==97)
			{
				continue;
			}
			list.add(character);
		}
		
		//printing the list
		for(char ele: list)
		{
			System.out.println(ele);
		}
	}

}
