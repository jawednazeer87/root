package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment121 {
    /*
  121
	long factorial(int)
		find factorial of given argument and return result
     */
    public long factorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
