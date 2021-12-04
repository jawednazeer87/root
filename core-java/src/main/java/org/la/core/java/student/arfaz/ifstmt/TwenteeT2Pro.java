package org.la.core.java.student.arfaz.ifstmt;

public class TwenteeT2Pro {

	public static void main(String[] args) {
		int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) {
            System.out.println(x + "," + y);
	}
  }

}
