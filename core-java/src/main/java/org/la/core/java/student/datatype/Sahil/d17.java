package org.la.core.java.student.datatype.Sahil;

public class d17 {
public static void main(String[] args) {
	 
	        int[] a = {1, 2, 3, 4, 5};
	        int[] b = {1, 1, 1,1,1,1,1,};
	        int[] c = new int[a.length + b.length];
	        int j = 0;
	        for (int i = 0; i < a.length; i++) {
	            c[j++] = b[i];
	        }
	        for (int i = 0; i < b.length; i++) {
	            c[j++] = b[i];
	        }
	        System.out.println("Arrays.toString("+c+") = " + "Arrays.toString"+(c));
}
}
