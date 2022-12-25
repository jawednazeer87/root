package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOneArrayFromAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a = new int[5];
           int[] b = new int[5];
           
           Scanner scanner = new Scanner(System.in);
           
           for(int i=0,j=0;i<a.length;i++,j++) {
        	   System.out.println("Enter a value : ");
        	   a[i] = scanner.nextInt();
        	   scanner.nextLine();
        	   b[j] = a[i]; 
           }
           
           System.out.println(Arrays.toString(a));
           System.out.println(Arrays.toString(b));
           b[4]= 90;
           System.out.println(a[4]);
           System.out.println(b[4]);
           
           System.out.println(Arrays.toString(a));
           System.out.println(Arrays.toString(b));
           scanner.close();
	}

}
