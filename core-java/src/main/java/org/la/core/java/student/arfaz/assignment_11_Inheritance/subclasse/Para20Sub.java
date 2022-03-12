package org.la.core.java.student.arfaz.assignment_11_Inheritance.subclasse;

import org.la.core.java.student.arfaz.assignment_11_Inheritance.Pare20;

/*	20.create a parent class having protected String uppercase(String) method, override uppercase method in child class
		convert each character to uppercase and will return uppercase string.
*/
public class Para20Sub extends Pare20 {
	@Override
	protected String uppercase(String find){
		char a[] = find.toCharArray();   // here tocharArray will change the into string to chars

	for(int i=0;i<a.length;i++) {
	if(a[i]>='a'&&a[i]<='z') {
		a[i]=(char)(a[i]-32);        // A=65 a=97
		
	  }
	}
	find = String.valueOf(a); // here valuof wiil change the char[]array into string
	return find;
	}
	
	
	
	
}
