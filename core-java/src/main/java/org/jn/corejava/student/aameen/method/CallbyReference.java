package org.jn.corejava.student.aameen.method;

public class CallbyReference {

	public static void main(String[] args) {
		// call by reference
		int arr[]= {1,2,3,4};
		System.out.println("Main before calling : ");
		printarray(arr);
		System.out.println("");
		callreference(arr);
		System.out.println("");
		System.out.println("Main after calling and change of value in method ");
		printarray(arr);
	}
	static void printarray(int a[])
	{
		for(int c:a)
		{
			System.out.print(c+" ");
		}
	}
	static void callreference(int b[])
	{
		System.out.println("Value of int b[] : ");
		printarray(b);
		System.out.println("");
		b[0]=12;
		b[2]=50;
		System.out.println("Value of int b[] after change :");
		printarray(b);
		
	}

}
