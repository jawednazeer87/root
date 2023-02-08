package org.jn.core.java.student.shoaeeb.collection.framework;

import java.io.IOException;

public class Group {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee arr[]= new Employee[5];
		for(int i=0; i<5; i++)
		{
			arr[i]=Employee.getData();
		}
		for(int i=0; i<5; i++)
		{
			arr[i].displayData();
		}
	}

}
