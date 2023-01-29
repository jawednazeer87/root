package org.jn.core.java.jawed.optnl;

import java.util.Optional;

public class OptionalOfNullableExample {
	
	public static void main(String[] args) {
		String s = null;
		Optional<String> optional = Optional.ofNullable(s);
		System.out.println("empty: " + optional.isEmpty());
		System.out.println("present: " + optional.isPresent());
		optional.ifPresentOrElse(
				str -> System.out.println(s.length()), 
				() -> { 
					throw new RuntimeException("Object is null"); 
					} 
				);
	}

}
