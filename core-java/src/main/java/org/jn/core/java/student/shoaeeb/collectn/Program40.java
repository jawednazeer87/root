package org.jn.core.java.student.shoaeeb.collectn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list = Arrays.asList(new Double[] {4.5,3.2,6.5,99.0,33.21,5.53,4.43,4.5,3.2,6.5,1.1,1.2,1.4});
		
		
		//creating  a hashset and adding numbers;
		Set<Double> set = new HashSet<>();
		for(Double number: list)
		{
			set.add(number);
		}
		
		
		//converting set to list
		List<Double> newList = new ArrayList<>(set);
		
		//printing the list
		System.out.println(newList);
		
	}

}
