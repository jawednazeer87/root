package org.jn.corejava.student.aameen.array;

public class Assignment7 {

	public static void main(String[] args) {
		// wap to print only negative number from an array
		int a[]= {1,2,-13,-14,3,45,-1,-2,-3,-16};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("a["+i+"] : "+a[i]);
			}
		}

	}

}