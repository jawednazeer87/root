package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class Program6 {

	//6.	Convert integer array to String list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		List<String> list = new ArrayList<>();
		for(int ele: a)
		{
			list.add(Integer.toString(ele));
		}
		
		//printing the list
		
		for(String s:list)
		{
			System.out.print(s+" ");
		}
		
	}

}
