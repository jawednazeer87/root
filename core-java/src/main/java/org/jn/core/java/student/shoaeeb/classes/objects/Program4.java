package org.jn.core.java.student.shoaeeb.classes.objects;

public class Program4 {
	
	String name;
	int age;
	
	Program4(String s,int a)
	{
		name=s;
		age=a;
	}
	
	void talk() {
		System.out.println("name is: "+name+ " age is: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 p = new Program4("Rahul",25);
		p.talk();
	}

}
