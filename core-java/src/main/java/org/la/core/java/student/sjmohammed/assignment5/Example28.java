package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to remove a specific element from an array?
 */
public class Example28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 2, 3, 1, 7};
        int[] b = new int[a.length-1];
        int element = 3;
        
        for (int i = 0,j=0; i < a.length; i++,j++) {
            if (a[i]!=element){
                b[j]=a[i];
            }
            else {
            	j--;
            }
        }
        for(int i=0;i<b.length;i++) {
        	System.out.println("b["+i+"] "+b[i]);
        }
	}

}
