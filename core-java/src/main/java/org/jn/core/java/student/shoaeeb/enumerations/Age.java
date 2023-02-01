package org.jn.core.java.student.shoaeeb.enumerations;

public enum Age {
	SHOAEEB(155,20),SUMAIYA(153,22),SURAIYA(145,18);
	
	private int height;
	private int age;
	Age(int height,int age)
	{
		this.height = height;
		this.age=age;
	}
	static int getAge(int i) {
		Age allDetails[] = Age.values();
		return allDetails[i].age;
	}
	static int getHeight(int i)
	{
		Age allDetails[] = Age.values();
		return allDetails[i].height;
	}
	
}
