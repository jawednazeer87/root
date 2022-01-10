package org.la.core.java.jawed.array;

/**
 * @author jawednazeer
 * Sort an array without using any predefined function
 */
public class SortArray {

	public static void main(String[] args) {
		int[] src = {3, 2, 5, 1, -1};
		int[] sortArr = sort(src);
		print(sortArr);
	}
	static int[] sort(int[] src) {
		int len = src.length;
		for(int i=0 ; i<len ; i++) {
			for(int j=i+1 ; j<len ; j++) {
				if (src[i] > src[j]){  
					int tmp = src[i];  
					src[i] = src[j];  
					src[j] = tmp;  
				}  
			}
		}
		return src;
	}
	static void print(int[] a) {
		for(int i : a){
			System.out.println(i);
		}
	}
}
