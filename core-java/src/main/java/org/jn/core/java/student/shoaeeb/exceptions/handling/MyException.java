package org.jn.core.java.student.shoaeeb.exceptions.handling;

public class MyException extends Exception{

	static String names[]={"Rajesh","Lakshmi","Rahul","Ramesh"};
	static float bal[] = {5000,2000,3000,1000};
	
	MyException() {
		//default constructor
	}
	MyException(String exception)
	{
		super(exception);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=0;
		try {
			for(String name: names)
			{
				System.out.println(name+": "+bal[index] );
				if(bal[index]<=1000)
				{
					MyException me = new MyException("balance amout is less");
					throw me;
				}
				index++;
			}
		}
		
		catch(MyException me)
		{
			me.printStackTrace();
		}
	}

}
