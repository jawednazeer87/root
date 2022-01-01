package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;


public class Question34 {
	//		34) wap to remove all zero element from an array?

	
    public static void main(String[] args) {
        int[] a = new int[]{0, 5, 6, 0, 0, 2, 5};
        int j = 0; 
        for(int i = 0 ; i<a.length;i++) {
        	if(a[i]!=0) {
        		a[j] = a[i];
        		j++;
        	}
        }
        
        for(int i =0;i<j;i++)
            System.out.println(a[i]);
    }
}
