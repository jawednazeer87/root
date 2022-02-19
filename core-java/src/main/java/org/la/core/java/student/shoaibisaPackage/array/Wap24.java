package org.la.core.java.student.shoaibisaPackage.array;
import java.util.Scanner;

public class Wap24 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,i,temp;
		  
		  Scanner sc = new Scanner(System.in); 
		  
		  System.out.print(" enter the number of element ");
		  n = sc.nextInt();
		  int j = n;
		  int[] a = new int[n];
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
		  
		  for(i=0;i<=j;i++,j--)
		  {
		    temp=a[i];
		    a[i]=a[j-1];
		    a[j-1]=temp;
		    
		  }
		  System.out.print("\n reverse of array is ");
		  for(i=0;i<n;i++)
			  System.out.print(a[i]+" ");
		  
		  
		  sc.close();
	}
	
	

}
