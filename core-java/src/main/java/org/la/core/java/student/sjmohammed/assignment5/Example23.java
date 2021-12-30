package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to count occurrences of each element in an array?
 */
public class Example23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,45,54,55,8,54};

        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < a.length; j++) {
                if (a[i]==a[j])
                    count++;
            }
            System.out.println(a[i]+" appear " + count+" times");
        }
	}

}
