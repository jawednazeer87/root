package org.la.core.java.student.majeed.assignment8;

import org.la.core.java.student.wang.assignment8.Finish;

/*
23.	Create a class Finish having member variables id, finishName. create getters and 
	setters for all member variables. Create object of Finish class in other class inside main method
	and set all member values and print all member values using getters.
*/

public class FinishMain {
	
    public static void main(String[] args) {
        Finish finish = new Finish();
        finish.setId(1);
        finish.setFinishName("Mohammed");

        System.out.println("Id = " + finish.getId());
        System.out.println("Name = " + finish.getFinishName());
    }
}
