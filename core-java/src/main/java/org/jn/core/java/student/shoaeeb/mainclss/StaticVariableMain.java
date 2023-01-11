package org.jn.core.java.student.shoaeeb.mainclss;

public class StaticVariableMain {

	public static void main(String[] args) {
		//static variable is created only one time
		//instance variabble are created the number of times we create an object
		// TODO Auto-generated method stub
		StaticVariable sv = new StaticVariable();
		sv.printValues();
		sv.max=5;
		sv.printValues();
		sv.instVar=21;
		sv.max=6;
		sv.printValues();
		StaticVariable sv2 = new StaticVariable();
		sv2.printValues();
	}

}
