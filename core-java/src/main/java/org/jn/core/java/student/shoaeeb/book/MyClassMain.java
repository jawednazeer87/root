package org.jn.core.java.student.shoaeeb.book;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mi;//reference variable of parent class
		 SubClass1 obj= new SubClass1();
		 mi=obj;//pointing to the subclass object
		 System.out.println("Square of 5 is: "+mi.calculate(5));
		 SubClass2 obj1 = new SubClass2();
		 mi=obj1;
		 System.out.println("Square root of 4 is "+mi.calculate(4));
		 SubClass3 obj3 =  new SubClass3();
		 mi=obj3;
		 System.out.println("cube of 5 is: "+mi.calculate(5));
		 
		 
	}

}
