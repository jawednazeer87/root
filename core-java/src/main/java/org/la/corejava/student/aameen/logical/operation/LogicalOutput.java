package org.la.corejava.student.aameen.logical.operation;

public class LogicalOutput {

	public static void main(String[] args) {
		// what will be the value of a and b on printing
		
		System.out.println("Problem 1 ");
		System.out.println("------------");
		int a = 1;
		int b = 2;
		if(a==1 || ++b==3){
		System.out.println("hello world");
		}
		else { 
			System.out.println("given condition is false ");
		}
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		
		System.out.println("  ");
		System.out.println("Problem 2 ");
		System.out.println("------------");
		prob2();
		System.out.println("  ");
		
		System.out.println("Problem 3 ");
		System.out.println("------------");
		prob3();
		System.out.println("  ");
		
		System.out.println("Problem 4 ");
		System.out.println("------------");
		prob4();
		System.out.println("  ");
		
		System.out.println("Problem 5 ");
		System.out.println("------------");
		prob5();
	}
	static void prob2()
	{
		int a = 1;
		int b = 2;
		if(a==1 && ++b==3){
			System.out.println("hello world");
		}
		else { 
			System.out.println("given condition is false ");
		}
		
		System.out.println("a : " +a);
		System.out.println("b : " +b);
	}
	static void prob3()
	{	//what will be the value of a and b on printing

			int a = 1;
			int b = 2;
			if(a!=1 || b++==3){
				System.out.println("hello world");
			}
			else { 
				System.out.println("given condition is false ");
			}
			System.out.println("a : " +a);
			System.out.println("b : " +b);
			
	}
	static void prob4()
	{	//what will be the value of a and b on printing

		int a = 1;
		int b = 2;
		if(a!=1 && b++==3){
			System.out.println("hello world");
		}
		else { 
			System.out.println("given condition is false ");
		}
			System.out.println("a : " +a);
			System.out.println("b : " +b);
			
	}
	static void prob5()
	{		//print a, b, c, d and e
		boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = false;
        boolean e = a || !b || c || !d;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);

	}
	
	
}
