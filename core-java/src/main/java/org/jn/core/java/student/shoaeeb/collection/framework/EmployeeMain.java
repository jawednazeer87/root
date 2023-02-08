package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"Shoaeeb"));
		list.add(new Employee(2,"Suraiya"));
		list.add(new Employee(3,"Sumaiya"));
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the id to search");
		int key=Integer.parseInt(br.readLine());
		boolean found =false;
		for(Employee e: list)
		{
			if(e.getId()==key)
			{
				found=true;
				System.out.println("Name: "+e.getName());
			}
		}
		if(!found)
		{
			System.out.println("Not in the list");
		}
		
	}

}
