package org.jn.core.java.student.shoaeeb.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(5,"Naman",1456.00f));
		list.add(new Employee(1,"Tamanna",54545f));
		list.add(new Employee(3,"Sataima",4556f));
		list.add( new Employee(4,"Abhijeet",56454f));
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		
		});
		
	}

}
