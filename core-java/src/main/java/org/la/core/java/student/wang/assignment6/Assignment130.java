package org.la.core.java.student.wang.assignment6;

public class Assignment130 {
    /*
  130
	int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0};
		count number of zeros and return
     */
    public static int countZero(int a[]) {
        int frequency = 0;
        for (int i : a) {
            if (i == 0) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        int a[] = {1,0,1,0,0,1,1,0};
        System.out.println("countOnes(a) = " + countZero(a));
    }
}