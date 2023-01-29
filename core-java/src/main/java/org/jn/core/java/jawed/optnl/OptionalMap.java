package org.jn.core.java.jawed.optnl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMap {

	public static void main(String[] args) {
		List<String> listString = Arrays.asList("1", "5", "2", "78", "32", "55", "100", "31", "211");
		Optional<List<String>> opt = Optional.of(listString);
		Optional<List<Integer>> map = opt.map(list -> {
			List<Integer> listInt = new ArrayList<>();
			for (String str: list) {
				listInt.add(Integer.valueOf(str));
			}
			return listInt;
		});
		map.ifPresent(list -> System.out.println("int value: " + list));
	}
	
	
}
