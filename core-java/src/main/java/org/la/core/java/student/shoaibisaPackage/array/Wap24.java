package org.la.core.java.student.shoaibisaPackage.array;
import java.util.Scanner;

public class Wap24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,i,temp;
		  int[] a = new int[10];
		  Scanner sc = new Scanner(System.in); 
		  System.out.print(" enter the number of element ");
		  n = sc.nextInt();
		  System.out.print("  Enter the element of array ");
		  for(i=0;i<n;i++)
		  {
			  a[i] = sc.nextInt();
		  }
		  System.out.print(" array is now ");
		  for (i=0;i<n;i++)
		  {
			  System.out.print(a[i]+" ");
		  }
		  
		  for(i=0;i<=n/2-1;i++)
		  {
		    temp=a[i];
		    a[i]=a[n-1];
		    a[n-1]=temp;
		    n--;
		  }
		  System.out.print(" reverse of array is ");
		  for(i=0;i<n;i++)
			  System.out.print(a[i]+" ");
	}

}
