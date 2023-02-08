package org.jn.core.java.student.shoaeeb.objects;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnonymousClass extends Frame{

	AnnonymousClass() {
		Button b = new Button("ok");
		add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymousClass a = new AnnonymousClass();
		a.setSize(400,200);
		a.setVisible(true);
	}

}
