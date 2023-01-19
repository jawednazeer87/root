package org.la.corejava.student.aameen.array;

public class Assignment11 {
	public static void main(String[] args) {
		
		//wap to copy one array into other array
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println("b["+i+"] :"+b[i]);
		}
	}
}
