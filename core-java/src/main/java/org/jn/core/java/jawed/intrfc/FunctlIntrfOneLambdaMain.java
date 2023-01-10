package org.jn.core.java.jawed.intrfc;

public class FunctlIntrfOneLambdaMain {

	public static void main(String[] args) {
		FunctlIntrfOne fio = () -> System.out.println("hello world");
		fio.color();
		fio = () -> System.out.println("red");
		fio.color();
	}
}
