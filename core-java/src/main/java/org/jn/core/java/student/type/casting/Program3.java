package org.jn.core.java.student.type.casting;

public class Program3 {
	static String knowName(Object obj) {
		Class c = obj.getClass();
		String name=c.getName().substring(38);
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 obj = new Program2(15);
		String name=Program3.knowName(obj);
		System.out.println("Name: "+name);
	}

}
