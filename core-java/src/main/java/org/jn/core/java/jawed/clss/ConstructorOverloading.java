package org.jn.core.java.jawed.clss;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		System.out.println("default constructor");
	}
	public ConstructorOverloading(int id) {
		System.out.println("id: "+id);
	}
	public ConstructorOverloading(String name) {
		System.out.println("name: "+name);
	}
	public ConstructorOverloading(int id, String name) {
		System.out.print("name: "+name);
		System.out.println(", id: "+id);
	}
	public ConstructorOverloading(String name, int id) {
		System.out.print("another constructor");
		System.out.print(", name: "+name);
		System.out.println(", id: "+id);
	}
}
