package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment122 {
    /*
  122
	boolean prime(int)
		check whether given number is prime or not and return true or false
     */
    public boolean prime(int num) {
            boolean isItPrime = true;
            if (num <= 1) {
                isItPrime = false;
                return isItPrime;
            } else {
                for (int i = 2; i < num; i++) {
                    if ((num % i) == 0) {
                        isItPrime = false;
                        break;
                    }
                }
                return isItPrime;
        }
    }
}