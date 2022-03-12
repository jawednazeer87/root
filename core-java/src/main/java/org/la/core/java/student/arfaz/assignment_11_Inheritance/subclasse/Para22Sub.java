package org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.Pare22;

/*	22.	create a parent class having protected String concat(String, String, String) method, override concat method in child class
		which will concat all strings separated by space and will return new concated string.
*/
public class Para22Sub extends Pare22 {
	@Override
	protected String concat(String a, String b, String c){
		String concatenation = a+" "+b+" "+c;
	return concatenation;
	}
	
	
	
	
}
