package org.jn.core.java.student.type.casting;

public class MyClass {

	int x;
	MyClass(int x)
	{
		this.x=x;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj1  =new MyClass(15);
		MyClass obj2 =new MyClass(15);
		//in this case references will be checked
		if(obj1.equals(obj2))
		{
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
	}

}
