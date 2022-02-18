package org.la.core.java.student.shoaibisaPackage.classPolymorphism;


//example of dispatch
//class A {
//	public void f() {
//		System.out.println("Base class");
//	}
//}
//
//class B extends A {
//	
//	public void f() {
//		System.out.println("Derived class");
//	}
//}

class Shape {
	
	public void draw() {
		System.out.println("basic shape");
	}
}

class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Circle has round shape");
	}
}

class Triangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Three sided shape");
	}
}
class Cylindre extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Has height and having 3D space");
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new B();
//		
//		a.f();
		Triangle t = new Triangle();
		
		t.draw();
		

	}

}
