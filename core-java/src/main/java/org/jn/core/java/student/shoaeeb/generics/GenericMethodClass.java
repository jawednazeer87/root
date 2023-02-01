package org.jn.core.java.student.shoaeeb.generics;

public class GenericMethodClass{
	static <T>  void printArray(T[] arr)
	{
		for(T ele: arr)
		{
			System.out.print(ele+" ");
		}
	}
}


