package org.la.corejava.student.aameen.array;

public class PrintNegativeArray {

	public static void main(String[] args) {
		// printing negative array '
		int a[]= {1,2,3,4,-12,-45,5,6,-5};
		for(int i =0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println("a["+i+"] : "+a[i]);
			}
			}

	}

}
