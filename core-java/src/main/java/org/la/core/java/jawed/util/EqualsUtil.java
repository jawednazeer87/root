/**
 * 
 */
package org.la.core.java.jawed.util;

import org.la.core.java.jawed.clss.Apple;
import org.la.core.java.jawed.model.Employee;

/**
 * @author jawednazeer
 *
 */
public class EqualsUtil {
	public static void appleEquals() {
		Apple a1 = new Apple(1, "sweet", "red");
		Apple a2 = new Apple(1, "sweet", "red");
		boolean b = a1.equals(a2);
		System.out.println(b);
	}
	
	public static void employeeEquals() {
		Employee emp1 = new Employee(0, null, false, null, null, null, null, null);
		Employee emp2 = new Employee(0, null, false, null, null, null, null, null);
		boolean b = emp1.equals(emp2);
		System.out.println(b);
	}
}
