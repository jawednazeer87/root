package org.jn.corejava.student.aameen.clss;

public class BasicParentChild extends BasicParent{
	
	public void callBasicParentClass()
	{
		publicMethod();
	//	privateMethod(); cannot be accesed because its private 
		defaultMethod(); // it is only accessed because it is in same package 
		
		
		
	}

}
