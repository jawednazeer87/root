package org.jn.core.java.student.mirza.baig.clss.collection;

import java.util.ArrayList;
import java.util.List;

public class CharList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] a = {'a', 'd', 'c', 'b', 'a', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
				
			List<Character> list= new ArrayList<>();
			
			for (char i:a) {
				
				list.add(i);
			}
				System.out.println(list);
			
		}
	}




//Convert char array to char list 
//char[] a = {'a', 'd, 'c', 'b', 'a', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};