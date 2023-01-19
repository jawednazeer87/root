package org.la.corejava.student.aameen.array;

public class Assignment10 {

	public static void main(String[] args) {
		// wap to print array in reverse order
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		
		for(int i =0;i<a.length;i++)
		{
			 b[i]=a[a.length-1-i];
		}
			for(int i=0;i<a.length;i++)
			{
				System.out.println("b["+i+"] :"+b[i]);
			}
	}

}
