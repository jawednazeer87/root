package org.la.core.java.student.datatype.Sahil;

public class d25 {
public static void main(String[] args) {
	int[] a = {4, 2, 3};
    int length = a.length, sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum+=a[i];
    }
    int aveValue = sum / length;
    System.out.println("aveValue = " + aveValue);


}

}
