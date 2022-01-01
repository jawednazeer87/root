package org.la.core.java.jawed.method;

public class MethodRemoveZeroArr {

	public static void main(String[] jhj) {
		int a[] = removeZeros(new int[]{7,0,99,0,100,10,0,5,20,0,77,0});
		printArray(a);
	}
	
	static int[] removeZeros(int[] arr) {
		int size = 0;
		for(int a : arr) {
			if(a!=0) {
				size++;
			}
		}
		int trgt[] = new int[size];
		int i=0;
		for(int a : arr) {
			if(a!=0) {
				trgt[i++] = a;
			}
		}
		return trgt;
	}
	
	static void printArray(int[] arr) {
		int i = 0;
		for(int a : arr) {
			System.out.println("a["+i++ +"] = "+a);
		}
	}
}
