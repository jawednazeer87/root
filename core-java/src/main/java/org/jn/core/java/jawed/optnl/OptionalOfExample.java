package org.jn.core.java.jawed.optnl;

import java.util.Optional;

public class OptionalOfExample {
	
	public static void main(String[] args) {
		String s = "name";
		Optional<String> optional = Optional.of(s);
		System.out.println("empty: " + optional.isEmpty());
		System.out.println("present: " + optional.isPresent());
		optional.ifPresent(
				str -> System.out.println(s.length()));
	}

}
