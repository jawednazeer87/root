package org.la.core.java.student.shoaibisaPackage.classPolymorphism;

class Parent{
	static void fun() {
		System.out.println("Paent fun");
	}
}

class Child extends Parent {
	
	//@Override
	static void fun() {
		System.out.println("overriding in child!");
	}
}

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//having parent reference
		Parent p = new Child();
		p.fun();  //The static method fun() from the type Parent should be accessed in a static way

		
		
		//having child reference
		Child c = new Child();
		c.fun();
	}

}
