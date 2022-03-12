package org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.Pare21;

/*	20.create a parent class having protected String uppercase(String) method, override uppercase method in child class
		convert each character to uppercase and will return uppercase string.
*/
public class Para21Sub extends Pare21 {
	@Override
	protected String lowercase(String find){
		char a[] = find.toCharArray();   // here tocharArray will change the into string to chars

	for(int i=0;i<a.length;i++) {
	if(a[i]>='A'&&a[i]<='Z') {
		a[i]=(char)(a[i]+32);        // A=65 a=97
		
	  }
	}
	find = String.valueOf(a); // here valuof wiil change the char[]array into string
	return find;
	}
	
	
	
	
}
