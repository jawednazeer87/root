package org.jn.core.java.student.shoaeeb.objects;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class But extends Frame{

	But() {
		Button b = new Button("ok");
		add(b);
		b.addActionListener(new MyClass());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		But obj =new But();
		obj.setSize(200,420);
		obj.setVisible(true);
	}
}
class MyClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
}
