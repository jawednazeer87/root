package org.la.core.java.student.datatype.moshin.assignment3;

public class Question23 {

	public static void main(String[] args) {
		
		int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) { //(21<( y= 25-4=21) false || (x=25)>21 true>>>true
            System.out.println(x + "," + y); //25,21
        }
	}

}
