package org.la.core.java.student.tanseer.assignment9.inheritance.parent;


public class StringReverseChild extends StringReverse

{
	@Override
	protected String reverse(String s) 
	{
		char[] ch= s.toCharArray();  
	    String rev="";  
	    
	    for(int i=ch.length-1; i>=0 ;i--)
	    {  
	        rev += ch[i];  
	    }  
	    return rev;
	}
	
}
