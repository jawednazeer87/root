package org.jn.core.java.jawed.collectn;

import java.util.Arrays;

import org.jn.core.java.jawed.util.QuestionsUtil;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,2,6,4,7,5};
		int[] res = QuestionsUtil.removeDuplicates(arr);
		System.out.println(Arrays.toString(res));
	}
}
