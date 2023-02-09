package org.jn.core.java.student.SahilMain;

import org.jn.core.java.student.Sahil.PublicInnerClass;
import org.jn.core.java.student.Sahil.PublicInnerClass.PublicInnerClassInner;

public class PublicInnerClassMain {
public static void main(String[] args) {
	PublicInnerClassInner obj = new PublicInnerClass().new PublicInnerClassInner();
	obj.setname("SAHIL");
	obj.setid(9);
}
}
