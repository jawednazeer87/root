package org.jn.core.java.student.shoaeeb.collectn;

import java.util.TreeMap;

public class Program65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();      
		  treemap.put(1, "C#");
		  treemap.put(2, "C++");
		  treemap.put(3, "Java");
		  treemap.put(4, "Python");
		  treemap.put(5, "Perl");
		  
		  System.out.println("Elements of TreeMap content are: " + treemap);
		  System.out.println("Keys which are greater than 3: " + treemap.tailMap(3, false));
		  System.out.println("Keys which are equal or greater than 3: " + treemap.tailMap(3));
	}

}
