package org.jn.core.java.student.shoaeeb.lambda;

public class PrintArrayClass1Main<T> extends PrintArrayClass1<T>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArrayClass1Main<Integer> pr = new PrintArrayClass1Main<>();
		Integer arr[] = {1,2,3,4,5,6,7};
		pr.printArray(arr);
	}

	@Override
	void printArray(T[] arr) {
		// TODO Auto-generated method stub
		for(T ele: arr)
		{
			System.out.println(ele);
		}
	}

}
