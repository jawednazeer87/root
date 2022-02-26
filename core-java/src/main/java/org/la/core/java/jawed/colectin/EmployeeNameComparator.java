/**
 * 
 */
package org.la.core.java.jawed.colectin;

import java.util.Comparator;

import org.la.core.java.jawed.model.Employee;

/**
 * @author jawednazeer
 *
 */
public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName()); 
	}

}
