package org.jn.core.java.jawed.optnl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {

	public static void main(String[] args) {
		List<Integer> listString = Arrays.asList(1, 5, 2, 78, 32, 55, 100, 31, 211);
		Stream<Integer> stream = listString.stream();
		List<Integer> i = stream.peek(x -> System.out.print(x + ", "))
				.collect(Collectors.toList());
		stream.peek(x -> System.out.print(x + ", "))
		.collect(Collectors.toList());
//		System.out.println("i: " + i);
	}
	
	
}
