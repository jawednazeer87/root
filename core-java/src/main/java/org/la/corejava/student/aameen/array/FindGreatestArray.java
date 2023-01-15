package org.la.corejava.student.aameen.array;

public class FindGreatestArray {

	public static void main(String[] args) {
		// FInd the greatest array in index
		
		int a[]= {19,12,1,2,3,4,5,100};
		int g=a[0];
		for(int i =1;i<a.length;i++)
		{
			if(g<a[i])
			{
				g=a[i];
			}
		}
		System.out.println("greatest in index is "+g);
	}

}
