package org.jn.core.java.jawed.clss;

public class CountNumMain {

	public static void main(String[] args) {
		CountNum countNum = new CountNum();
		countNum.set(10990);
		int num = countNum.get();
		System.out.println("num: "+num);
	}
}
