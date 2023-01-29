package org.jn.core.java.jawed.optnl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFilter {

	public static void main(String[] args) {
		List<Integer> listString = Arrays.asList(1, 5, 2, 78, 32, 55, 100, 31, 211);
		Optional<List<Integer>> opt = Optional.of(listString);
		List<Integer> filter = opt.get().stream().filter(x -> x>50).collect(Collectors.toList());
		System.out.println(filter);
	}
	
	
}
