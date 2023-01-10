package org.jn.core.java.jawed.clss;

public class AbstractClassImpl extends AbstractClass {

	@Override
	public void name() {
		System.out.println("name method");
	}

	@Override
	public int factorial(int num) {
		int f = 1;
		while(num>1) {
			f = f * num;
			num--;
		}
		return f;
	}
}
