package org.la.core.java.student.majeed.assignment6;

public class Program35 {
	
	public static void main(String[] args) {
		/*
		char[] reverse(char[] src)
		create new array and copy the src array to new array in reverse order
		 */
		char[] arr1 = {'a','b','c','d','e'};
		char[] arr2 = reverse(arr1);
		for(char a2:arr2) {
			System.out.println(a2);
		}
	}
	
	static char[] reverse(char[] a) {
		char[] result = new char[a.length];
		int j=0;
			for(int i=a.length-1;i>=0;i--) {
				result[j]=a[i];
				j++;
			}
	       return result;
		}
}