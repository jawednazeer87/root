package org.la.core.java.student.moshin.assignment9.Ques17;

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