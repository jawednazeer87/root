package org.jn.core.java.student.shoaeeb.practice;

import java.awt.Button;
import java.awt.Frame;

public class But extends Frame {
	But() {
		Button b = new Button("Ok");
		add(b);
		b.addActionListener(new MyClass());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		But obj = new But();
		obj.setSize(400,300);
		obj.setVisible(true);
	}

}
