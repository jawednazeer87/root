package org.la.core.java.student.moshin.assignment9.Ques17;

public class Pare17Sub extends Pare17 {
	@Override
	protected int search(String find, char desti[]){

		for(int i=0;i<desti.length;i++)      {
		if(find.charAt(i)==desti[i])
			return 1;

		}
	   return -1;	

	}

}