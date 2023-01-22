package org.jn.core.java.jawed.design.pattern;

public class SingletonMain {

	public static void main(String[] args) {
		// cannot create object as constructor is private
//		Singleton singleton = new Singleton();
		Singleton singleton1 = Singleton.instance();
		singleton1.setId(1);
		singleton1.setName("anil");
		Singleton singleton2 = Singleton.instance();
		System.out.println("before");
		System.out.println("Singleton1: " + singleton1); 
		System.out.println("Singleton2: " + singleton2); 
		singleton2.setName("sharma");
		System.out.println("after");
		System.out.println("Singleton1: " + singleton1); 
		System.out.println("Singleton2: " + singleton2);
	}
}
