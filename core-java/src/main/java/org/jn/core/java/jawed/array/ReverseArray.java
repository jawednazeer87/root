package org.jn.core.java.jawed.array;

public class ReverseArray {

	public static void main(String[] args) {
		int x[] = {-99999,-1, 50, 3, -1000};
		int len = x.length;
		for(int i=0, j=len-1 ; i<j ; i++, j--) {
			int t = x[i];
			x[i] = x[j];
			x[j] = t;
		}
		for(int z : x) {
			System.out.println(z);
		}
	}

}
