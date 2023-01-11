package org.jn.core.java.student.shoaeeb.childclss;
import org.jn.core.java.student.shoaeeb.mainclss.*;
public class TestChild extends Test {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		publicMethod();//public method accessible from child in differnt package
		//privateMethod();//private method not accessible
		//defaultMethod();//default method not accessible from child class in
		//different package
		protectedMethod();//protectedMethod is accessible from child class from
		//different package

	}

}
