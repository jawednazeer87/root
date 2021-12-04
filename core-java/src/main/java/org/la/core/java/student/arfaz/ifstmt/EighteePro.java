package org.la.core.java.student.arfaz.ifstmt;

public class EighteePro {

	public static void main(String[] args) {
		int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        if(a < b)
        {
            System.out.println("A is less than B");
        }
        
//        if(a = b) can't convert int to boolean
        if(a == b)
        {
            System.out.println("A is equal to B");
        }
        if(a > b)
        {
            System.out.println("A is greater than B");
        }
	}

}
