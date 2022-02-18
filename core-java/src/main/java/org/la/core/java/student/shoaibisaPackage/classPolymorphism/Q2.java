package org.la.core.java.student.shoaibisaPackage.classPolymorphism;

class Book{
	private String story;
	
	
	
	public void read() {
		System.out.println("Story says ");
	}
}

class MahiBook extends Book{
	@Override
	public void read() {
		System.out.println("Mahi book story ");
	}
}

class ShoaibBook extends Book  {
	
	@Override
	public void read() {
		System.out.println("Mahi book story ");
	}
}

public class Q2 {

	public static void main(String[] args) {
		
		MahiBook b1 = new MahiBook();
		b1.read();

	}

}
