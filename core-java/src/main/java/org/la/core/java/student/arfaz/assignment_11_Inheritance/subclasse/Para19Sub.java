package org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.Pare19;

/*	19.	Create a parent class having protected String reverse(String) method, override reverse method in child class
		reverse method will reverse and return reverse string.
	
*/
public class Para19Sub extends Pare19 {
	@Override
	protected String reverse(String find){
		String rev = "";
		for(int i=find.length()-1;i>=0;i--)
			rev = rev+find.charAt(i);
		return rev;		
		  	
	}
	
	
	
	
}
