package org.jn.core.java.student.SahilMain;

import org.jn.core.java.student.Sahil.InnerClassSimple;
import org.jn.core.java.student.Sahil.InnerClassSimple.InnerSimple;


public class InnerClassSimpleMain {
public static void main(String[] args) {
	InnerClassSimple obj = new InnerClassSimple();
	obj.Setid(12);
	obj.display();
	InnerSimple obj2 =  new InnerClassSimple().new InnerSimple();
	obj2.setname("SAHIL");
	obj2.display();
}
}
