package org.la.core.java.student.arfaz.assignment_6Fun;

/*
 * 
 * void printNum(int[], int)
		method will print number if found in array negative number from supplied array
		e.g. if a[]={1,2,3} n b=2 then print 2
		if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element

*/

public class PrintNum {

	public static void main(String[] args) {
		int a[] = {-1,-2,-3,-4,5,6,7,8,9},b=-3;
		printNum(a,b);
	}
	static void printNum(int[]a,int n) {
		int f=0;
		for(int i=0;i<a.length;i++)  {
			if(a[i]==n)
					f=1;
			
		}
        if(f==1)
        	System.out.println(n+" is found here");
        	else
				System.out.println(n+" is not found here");
	}
}
