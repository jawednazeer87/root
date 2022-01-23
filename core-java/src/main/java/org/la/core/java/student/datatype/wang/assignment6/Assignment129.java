package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment129 {
    /*
  129
	int countOnes(int a[])  a[] = {1,2,1,3,2,1,1,1};
		count number of times one in array and return count
     */
    public static int countOnes(int a[]) {
        int frequency = 0;
        for (int i : a) {
            if (i == 1) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 2, 1, 1, 1};
        System.out.println("countOnes(a) = " + countOnes(a));
    }
}