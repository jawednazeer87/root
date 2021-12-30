package org.la.core.java.student.sjmohammed.assignment5;
/*
 * wap to check whether two array are equal or not(means we have to check each element of two arrays)?
 */
public class Example20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,71,59,61,5,45};
		int b[]= {8,71,59,58,5,45};
		boolean isequal=true;
		if (a.length== b.length){
            for (int i = 0; i < a.length; i++) {
                if (a[i]!=b[i]){
                    isequal=false;
                }
            }
        }else {
            isequal=false;
        }
        if (isequal){
            System.out.println("Two arrays are equal");
        }else {
            System.out.println("Two arrays are not equal");
	}

	}
}