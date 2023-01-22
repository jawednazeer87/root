package org.jn.core.java.student.mirza.ifelse;

public class IfExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 75.0f;
        double d = 75.0;
        int i = 75;
        if( f == d )
        {
            if( f == i )
            {
                System.out.println("f, d and i are equal");
            }
            else
            {
                System.out.println("f, d are equal but i is not equal");
            }
        }
        else
        {
            System.out.println("f and d are not equal");
        }
	

        }
	}


