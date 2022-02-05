package org.la.core.java.student.tanseer.assignment8.main.classes;

import org.la.core.java.student.tanseer.assignment8.classes.Corporate;

public class CorporateMain 
{
	public static void main(String[] args) 
	{
		Corporate corporate = new Corporate();
		corporate.display();
		
		Corporate corporate1 = new Corporate("Jackie",3421,14000);
		corporate1.display();
		
		Corporate corporate2 = new Corporate("Michel",1234,20000);
		corporate2.display();
	}
}
