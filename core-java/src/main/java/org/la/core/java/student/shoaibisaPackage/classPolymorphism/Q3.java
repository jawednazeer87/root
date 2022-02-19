package org.la.core.java.student.shoaibisaPackage.classPolymorphism;

class Planet {
	
	
	public void name() {
		System.out.println("Planet names");
	}
	
	public void distance(int n) {
		System.out.println("Distance from sun"+n);
	}
}

class Earth extends Planet{
	
	public void name() {
		System.out.println("Earth");
	}
	public void distance(int n) {
		System.out.println("Distance from sun"+n);
	}
}

class Mercury extends Planet{
	
	public void name() {
		System.out.println("Mercury");
	}
	public void distance(int n) {
		System.out.println("Distance from sun of "+n);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planet p = new Earth();
		p.name();
		p.distance(150000000);
		
	}

}
