package org.jn.corejava.student.aameen.array;

public class Assignment13 {

	public static void main(String[] args) {
		//wap to find greatest number from any array 
		
		System.out.println("The greatest number from any array : "+greatest());
	}
	static int greatest()
	{
		int a[]= {100,99,95,88,1,2,3,4,56,67,89,12,103};
		int i,max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}return max;
		
	}

}
