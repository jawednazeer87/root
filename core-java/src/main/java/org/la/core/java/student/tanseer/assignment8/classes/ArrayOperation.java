package org.la.core.java.student.tanseer.assignment8.classes;

import java.util.Arrays;

public class ArrayOperation 
{
	public void copyArray(int[] a)
	{
		int[] b = a;
		System.out.println(Arrays.toString(b));
	}
	
	public void reverseArray(int[] b)
	{
		System.out.println("Reverse Array");
//		int[] result = new int[a.length];
//		int i = a.length - 1;
//		for(int c : result)
//		{
//			a[i--] = c;
//		}
//		System.out.println(Arrays.toString(result));
		
		int[] a = new int[b.length];
        int i = b.length-1;
        for (int element : b) {
            a[i--]= element;
        }
        System.out.println(Arrays.toString(a));
	}
	
	public int[] addTwoArrays(int[] a, int[] b)
	{
		System.out.println("Adding two arrays");
		int length = a.length < b.length ? a.length : b.length;
		int[] result = new int[length];
		
		for(int i  = 0; i < length ; i++)
		{
			result[i] = a[i] + b[i];
		}
		
		return result;
	}
	
	public void sumArray(int[] a)
	{
		System.out.println("Sum of arrays method called from class via object");
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for(int b : a)
		{
			sum += b;
		}
		System.out.println("sum of Array = " + sum);
	}
	
	public void findMax(int[] a)
	{
		System.out.println("Max of arrays method called from class via object");
		System.out.println(Arrays.toString(a));
        int max = a[0];
        for (int element : a) {
            if (element>max){
                max = element;
            }
        }
        System.out.println( "max of Array = " + max);
    }
	
	public void findMin(int[] a)
	{
		System.out.println("Min of arrays method called from class via object");
		System.out.println(Arrays.toString(a));
		int min = a[0];
		for (int element : a) {
			if (element<min){
				min = element;
			}
		}
		System.out.println( "max of Array = " + min);
	}
	
	public void countNegative(int[] a){
        int sumOfNeg = 0;
        for (int element : a) {
            if (element<0){
                sumOfNeg++;
            }
        }
        System.out.println("sumOfNeg = " + sumOfNeg);
    }

    public void countPositive(int[] a)
    {
        int sumOfPos = 0;
        for (int element : a) {
            if (element>0){
                sumOfPos++;
            }
        }
        System.out.println("sumOfPos = " + sumOfPos);
    }
}
