package org.jn.core.java.student.shoaeeb.enumerations;

public class ColorsMain {
	Colors c;
	ColorsMain(Colors c)
	{
		this.c=c;
	}
	void display() {
		switch(c)
		{
		case GREEN: System.out.println("COLOR IS GREEN");
			break;
		case RED: System.out.println("COLOR IS RED");
			break;
		case YELLOW: System.out.println("COLOR IS YELLOW");
			break;
		case WHITE: System.out.println("COLOR IS WHITE");
			break;
		default: System.out.println("Not a good color");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorsMain ct = new ColorsMain(Colors.GREEN);
		ct.display();
	}

}
