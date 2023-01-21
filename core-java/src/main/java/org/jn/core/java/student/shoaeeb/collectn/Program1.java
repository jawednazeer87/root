package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Program1 {
	//1.	Convert integer array to integer list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		List<Integer> list = new ArrayList<>();
		
		for(int ele: arr)
		{
			list.add(ele);
		}
		
		//printing the list using iterator
		ListIterator<Integer> it  = list.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
