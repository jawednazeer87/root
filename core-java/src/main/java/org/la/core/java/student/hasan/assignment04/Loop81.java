package org.la.core.java.student.hasan.assignment04;

public class Loop81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;  
		for (int i= 0; i<= rows-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=rows-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		}  
	}

}
