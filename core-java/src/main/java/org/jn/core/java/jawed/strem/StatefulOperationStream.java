package org.jn.core.java.jawed.strem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatefulOperationStream {

	public static void main(String[] args) {
		List<Integer> listString = Arrays.asList(1, 5, 2, 78, 32, 55, 100, 31, 211);
		List<Integer> collect = listString.stream().sorted()
				.peek(x->System.out.println(x + ", ")).collect(Collectors.toList());
		
		collect = Arrays.asList(1, 5, 2, 78, 32, 55, 100, 31, 211).stream()
				.peek(x->System.out.println(x + ": ")).collect(Collectors.toList());
		
	}
}
