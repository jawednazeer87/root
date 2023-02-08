package org.jn.core.java.student.shoaeeb.methods;

public class Program11 {

	int id1;
	int id2;
	Program11(int x, int y) {
		id1=x;
		id2=y;
	}
	void swap(Program11 obj)
	{
		int temp=obj.id1;
		obj.id1=obj.id2;
		obj.id2=temp;
	}
	void display() {
		System.out.println(id1+" "+id2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program11 p = new Program11(1,2);
		p.display();
		p.swap(p);
		p.display();
		
	}

}
