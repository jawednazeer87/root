/**
 * 
 */
package org.jn.core.java.jawed.clss.one;

import java.time.LocalDate;

import org.jn.core.java.jawed.clss.Employee;

/**
 * @author jawednazeer
 *
 */
public class EmployeeMain {

	public static void main(String[] args) {
		Employee  employee1 = new Employee();
		LocalDate dob = LocalDate.of( 1987 , 2 , 14 );
		employee1.setters(1, 2222, "name", dob);
		employee1.print();
		int sal = employee1.getSalary();
		System.out.println("salary: "+sal);
		int id = employee1.getId();
		employee1.setName("asif");
		System.out.println("name: "+employee1.getName());
	}
}
