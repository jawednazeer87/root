package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program7 {
	//7.	Convert String list to integer list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = Arrays.asList(new String[] {"123","12","35","54","66","77","55","221","33"});
		List<Integer> integerList = new ArrayList<>();
		for(String s: stringList)
		{
			int c=Integer.parseInt(s);
			integerList.add(c);
		}
		
		for(int i: integerList)
		{
			System.out.println(i);
		}
	}

}
