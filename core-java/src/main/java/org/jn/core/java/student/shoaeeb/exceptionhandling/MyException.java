package org.jn.core.java.student.shoaeeb.exceptionhandling;

public class MyException extends Exception  {
	private static int accno[]= {1001,1002,1003,1004};
	private static String name[] = {"Laxmi","Raja","Sam","Deb"};
	private static int balance[] = {5000,3000,1000,2000};
	
	//default exception
	MyException() {
		
	}
	MyException(String str) {
		super(str);//passing it to parent class
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Accno \t Name\t Balance");
			
			for(int i=0; i<accno.length; i++)
			{
				System.out.println(accno[i]+ "\t"+name[i]+"\t"+balance[i]);
				if(balance[i]<=1000)
				{
					throw new MyException("Balance is low");
				}
			}
		}
		catch(MyException ae)
		{
			System.out.println(ae);
		}
	}

}
