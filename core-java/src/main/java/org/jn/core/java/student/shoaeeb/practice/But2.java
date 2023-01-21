package org.jn.core.java.student.shoaeeb.practice;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class But2 extends Frame{

	But2() {
		Button b = new Button("Ok");
		add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		But2 obj = new But2();
		obj.setSize(400,300);
		obj.setVisible(true);
		
	}

}
