package org.jn.corejava.student.aameen.method;

public class StaticMethodExample {

	public static void main(String[] args) {
		
		StaticMethodExample ex = new StaticMethodExample();
		
		StaticMethod();
		ex.InstanceMethod();
		
	}
	
		public static void StaticMethod()
	{
		System.out.println("This is a Static Method ");
	}
		
		public void InstanceMethod()
		{
			System.out.println("This is a Instance Method ");
		}
	
}
