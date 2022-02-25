package org.la.core.java.student.wang.assignment9.Task14;

public class Parent14 {
    void increaseStar(int myrows){
        for (int m = 1; m <= myrows; m++)
        {
            for (int n = 1; n <= m; n++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
