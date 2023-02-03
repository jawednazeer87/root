package org.jn.corejava.student.aameen.clss.one;

public class ThiswithConstructor {
		
		public ThiswithConstructor()
		{
			this(1);
			System.out.println("default constructor ");
		}
		
		public ThiswithConstructor(int i)
		{
			this(2,3);
			System.out.println("one parameterized constructor i : "+i);
		}
		
		public ThiswithConstructor(int i , int w)
		{
			System.out.println("two parameterized constructor i :"+i+", w: "+w);
		}
}
