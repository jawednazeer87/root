package org.la.core.java.student.hasan.assignment03;

public class Condition23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) {
            System.out.println(x + "," + y);
        }
	}

}
