
package org.jn.core.java.student.SahilMain;

public class StringProperty {
public static void main(String[] args) {
	String str =new String("HAIDER");
	String str1 = new String("SAHIL").intern();
	String str2=new String ("SAHIL").intern();
	String str3 = new String("HAIDER");
	System.out.println((str1==str2)); 
	System.out.println(str==str3);

}
	
}
