package org.la.corejava.student.aameen.array;

public class Assignment4 {

	public static void main(String[] args) {
		// wap to print only odd numbers from an array
		int a []= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("a["+i+"]:"+a[i]);
			}
		}

	}

}
