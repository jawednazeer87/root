package org.la.core.java.student.shoaibisaPackage.classV;

class Counter {
	private int count;
	public Counter() {} //assign count to default 0
	
	public Counter(int a) {
		count = a;
	}
	public int getCount() {
		return count;
	}
	public void reset() {
		count =0;
	}
	public void increment() {
		count++;
	}
}

public class CounterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c;  //reference of class counter variable is c
		c = new Counter();  //object created
		c.increment();
		System.out.print(c.getCount());
		

	}

}
