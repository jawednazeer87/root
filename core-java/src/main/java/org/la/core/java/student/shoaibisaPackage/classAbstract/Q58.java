package org.la.core.java.student.shoaibisaPackage.classAbstract;
abstract class AbstractClass {
	
	abstract void getFirstMethod();

	public void getSecondMethod() {
		System.out.println("second method");
		getFirstMethod();
	}
}

abstract class Subclass1 extends AbstractClass {

	@Override
	public void getFirstMethod() {
		System.out.println("first method");
	}

	abstract void getThirdMethod();
}

 class Subclass2 extends Subclass1 {

	public void getThirdMethod() {
		System.out.println("third method");
	}
}
public class Q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //base object
		Subclass1 obj = new Subclass2();
		obj.getFirstMethod();
	}

}
