package org.la.corejava.student.aameen.array;

public class CopyingArray {

	public static void main(String[] args) {
		// copying from one array to another 
		
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		
		for(int i =0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i =0;i<a.length;i++)
		System.out.println("a["+i+"] = "+a[i]);
		
		System.out.println("");
		
		for(int i =0;i<b.length;i++)
			System.out.println("b["+i+"] = "+b[i]);

	}

}
