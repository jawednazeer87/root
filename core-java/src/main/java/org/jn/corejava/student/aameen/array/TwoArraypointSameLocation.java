package org.jn.corejava.student.aameen.array;

public class TwoArraypointSameLocation {

	public static void main(String[] args) {
		// Two Array point Same Location
		
		int a[]= {1,2,3,4,5};
		for(int i =0;i<a.length;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println(" ");
		int b []=a;
		b[3]=12;
		b[4]=19;
		for(int i =0;i<a.length;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
	}

}
