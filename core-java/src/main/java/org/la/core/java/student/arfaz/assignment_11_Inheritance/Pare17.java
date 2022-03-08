package org.la.core.java.student.arfaz.assignment_11_Inheritance;

/*		Create a class having method protected int search(String, char), create a child class which will override this method
		in this method u have to search character in the string if found then return position means location if not found then
		return -1.*/
public class Pare17 {
	public Pare17()  {
		
	}
	protected int search(String find, char desti[]){
	
		for(int i=0;i<desti.length;i++)      {
		if(find==Character.toString(desti[i]))
			return i;
		
		}
	   return 0;	
		  	
	}
	
	
}
