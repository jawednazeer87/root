package org.jn.core.java.jawed.collectn;

import java.util.HashSet;
import java.util.Set;

public class SetFindDuplicate {

	public static void main(String[] args) {
		int[] arr = {31,1,2,3,4,5,6,7,8,9,10,11,12,101,0,20,21,31};
		int res = findDuplicate(arr);
		System.out.println("duplicate: " + res);
	}
	
	public static int findDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i=0; i<arr.length; i++) {
			if (!set.add(arr[i])) {
				return arr[i];
			}
		}
		return -1;
	}
}
