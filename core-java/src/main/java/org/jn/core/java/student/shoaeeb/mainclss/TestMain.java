package org.jn.core.java.student.shoaeeb.mainclss;

public class TestMain {
	//creating Test Main in the same package
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ts = new Test();
		ts.publicMethod();//accessible
		//ts.privateMethod();//private method is not accessible
		//only accessible in the same class
		ts.defaultMethod();//accessible
		ts.protectedMethod();//accessible
		
	}

}
