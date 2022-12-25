package org.la.corejava.student.aameen.logical.operation;

public class LogicalBooleanOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Problem 6 ");
		System.out.println("------------");
		
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY && lampX;
        System.out.println("Lamp switch-on : " + result);
        result = lampY & lampX;
        System.out.println("Lamp switch-on : " + result);
        
        System.out.println("   ");
		System.out.println("Problem 7 ");
		System.out.println("------------");
		prob7();
		System.out.println("   ");
		System.out.println("Problem 8");
		System.out.println("------------");
		prob8();
		System.out.println("   ");
		System.out.println("Problem 9");
		System.out.println("------------");
		prob9();
		System.out.println("   ");
		System.out.println("Problem 10");
		System.out.println("------------");
		prob10();
		System.out.println("   ");
		System.out.println("Problem 11");
		System.out.println("------------");
		prob11();
		System.out.println("   ");
		System.out.println("Problem 12");
		System.out.println("------------");
		prob12();
	}
	static void prob7()
	{
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on : " + result);
        result = lampY | lampX;
        System.out.println("Lamp switch-on : " + result);
	}
	
	static void prob8()
	{
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on : " + result);
        result = lampY && lampX;
        System.out.println("Lamp switch-on : " + result);
	}
	static void prob9()
	{

			boolean lampX = false, result;
	        boolean lampY = true;
	        result = lampY && lampX;
	        System.out.println("Lamp switch-on : " + result);
	        result = lampY || result;
	        System.out.println("Lamp switch-on : " + result);
	}
	static void prob10(){
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on : " + result);
        result = result && lampX;
        System.out.println("Lamp switch-on : " + result);
		
	}
	static void prob11() {
		int c = 0, d = 50, e = 50;
        boolean b = (c == 1) && (++e < 100);
        System.out.println("e = " + e);
        System.out.println("b = " +b);
        boolean f = (++e < 100) && (c == 1);
        System.out.println("f = " +f);
        System.out.println("e = " + e);
	}
	static void prob12()
	{
		int c = 0, e = 50;
        boolean b = (c == 1) && (++e < 100);
        System.out.println("e = " + e);
        System.out.println("b = " +b);
        boolean f = (++e < 100) && (c == 1);
        System.out.println("e = " + e);
        System.out.println("f = " +f);
        
	}

}
