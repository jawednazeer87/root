package org.jn.core.java.student.shoaeeb.generics;

public class GenericMethodClassMain {
 
	public static void main(String args[])
	{
	 Integer arr[] = {1,2,3,4,5,6};
	 System.out.println("Integer array print");
	 GenericMethodClass.printArray(arr);
	 Float arr1[] = {2f,3f};
	 System.out.println("Float array Print");
	 GenericMethodClass.printArray(arr1);
	 String arr2[] = {"ravi","kumar","T.harish"};
	 GenericMethodClass.printArray(arr2);
	 

	}
}
