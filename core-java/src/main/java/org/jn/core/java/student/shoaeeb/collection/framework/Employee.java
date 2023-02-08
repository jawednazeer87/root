package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {

	private int id;
	private String name;
	
	Employee() {
		
	}
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	static Employee getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String name=br.readLine();
		System.out.println("Enter id:");
		int id=Integer.parseInt(br.readLine());
		Employee e = new Employee(id,name);
		return e;
		
	}
	 void displayData() {
		System.out.println("Id: "+id+ " Name: "+name);
	}

}
