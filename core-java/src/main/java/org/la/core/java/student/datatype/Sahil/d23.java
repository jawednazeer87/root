package org.la.core.java.student.datatype.Sahil;

public class d23 {
public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5, 6, 1, 8, 5, 10, 1, 1};

    for (int i = 0; i < a.length; i++) {
        int count=0;
        for (int j = 0; j < a.length; j++) {
            if (a[i]==a[j])
                count++;
        }
        System.out.println(a[i]+" appear " + count + " times ");
    }
}
}
