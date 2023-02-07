package org.jn.core.java.student.SahilMain;

import org.jn.core.java.student.Sahil.FunInterface;
import org.jn.core.java.student.Sahil.FunInterfaceImp;

public class FunInterfaceMain {
public static void main(String[] args) {
	
	FunInterface obj = new FunInterfaceImp();
	obj.displayColor();
	FunInterface.print();
}
}
