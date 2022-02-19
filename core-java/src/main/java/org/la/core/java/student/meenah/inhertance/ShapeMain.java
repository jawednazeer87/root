package org.la.core.java.student.meenah.inhertance;

public class ShapeMain {

	public static void main(String[] args) {
		
		//Override method name
		Shape sh = new Tringle();
		sh.drew(); 
		
		sh = new Square();
		sh.drew();
		
		sh = new Circle();
		sh.drew();

	}

}
