package org.jn.core.java.jawed.optnl;

import java.util.Optional;

public class OptionalOne {
	
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.empty();
		System.out.println("empty: " + optional.isEmpty());
		System.out.println("present: " + optional.isPresent());
	}

}
