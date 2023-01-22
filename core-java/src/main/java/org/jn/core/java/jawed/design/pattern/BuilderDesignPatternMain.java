package org.jn.core.java.jawed.design.pattern;

public class BuilderDesignPatternMain {

	public static void main(String[] args) {
	// cannot create object, constructor is private
//		BuilderDesignPattern bdp = new BuilderDesignPattern(0, 0, null, null, 0, 0, 'c');
		BuilderDesignPattern.Builder builder = new BuilderDesignPattern.Builder(1);
		builder.setId(1).setRoll(1).setName("amit").setEmail("amit@mail.com")
				.setWeight(65.43).setHeight(5.8).setGender('m');
		BuilderDesignPattern builderDesignPattern = builder.build();
		System.out.println(builderDesignPattern);
	}
}
