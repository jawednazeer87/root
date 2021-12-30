package org.la.core.java.student.sjmohammed.assignment5;

/*
 * wap to remove all zero element from an array?
 */
public class Example34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 2, 0, 1, 7};
        int[] b = new int[a.length];
        
        for (int i = 0,j=0; i < a.length; i++,j++) {
            if (a[i]!=0){
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
