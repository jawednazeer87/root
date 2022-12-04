package org.jn.core.java.jawed.datatype;

public class TestUmerFaaroque {

	public static void main(String[] args) {
		
		Double object = new Double("1.4"); 

        
		int a = object.intValue(); 
		System.out.println("a: "+a);
		        
		byte b = object.byteValue(); 
		System.out.println("b: "+b);
		        
		float d = object.floatValue(); 
		System.out.println("d: "+d);
		        
		double c = object.doubleValue(); 
		System.out.println("c: "+c);
		
		System.out.println("sum: "+(a+b+c+d));
		
		float f = 1.5f;
		if(f==1.5) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}
