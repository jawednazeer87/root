package org.jn.core.java.jawed.clss;

public class BuildExampleMain {

	public static void main(String[] args) {
		BuildExample be = new BuildExample();
		be.setDesignation("manager");
		be.setGender('m');
		be.setId(10);
		be.setName("amin");
		be.setWeight(60.98);
		be.print();
		
		BuildExample be2 = new BuildExample();
		be2.setDesignation("developer")
			.setGender('f')
			.setId(100)
			.setName("amina")
			.setWeight(99.99);
		be2.print();
	}
}
