package org.jn.core.java.jawed.design.pattern;

public class Singleton {

	private int id;
	private String name;
	private static Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton instance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{id: " + id + ", name: " + name + "}";
	}
	
}
