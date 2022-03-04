package org.la.core.java.student.moshin.assignment9.Ques14;

public class Parent {
	void increaseStar(int myrows){
        for (int m = 1; m <= myrows; m++)
        {
            for (int n = 1; n <= m; n++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
