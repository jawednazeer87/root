package org.jn.corejava.student.aameen.ifandelse;

public class Output {

	public static void main(String[] args) {
		// Program -14 
		  System.out.println("Program - 14 ");
	        System.out.println("-----------");
		boolean a, b, c;
        a = b = c = true;
        if( !a || ( b && c ) )
        {
            System.out.println("If executed");
        }
        else
        {
            System.out.println("else executed");
        }
        System.out.println("   ");
        System.out.println("Program - 15 ");
        System.out.println("-----------");
        program15();
        System.out.println("   ");
        System.out.println("Program - 16 ");
        System.out.println("-----------");
        program16();
        System.out.println("   ");
        System.out.println("Program - 17 ");
        System.out.println("-----------");
        program17();
        System.out.println("   ");
        System.out.println("Program - 19 ");
        System.out.println("-----------");
        program19();
        System.out.println("   ");
        System.out.println("Program - 20 ");
        System.out.println("-----------");
        program20();
        System.out.println("   ");
        System.out.println("Program - 21 ");
        System.out.println("-----------");
        program21();

	}
	static void program15()
	{
		int num1 = 1, num2 = 2;
		if( num1 > num2 )
        {
            System.out.println(" 1 is greater than 2");
        }
		else 
            System.out.println(" 2 is greater than 1");

	}
	static void program16()
	{
		int num1 = 1, num2 = 2;
		if( num1 < num2 )
        {
            System.out.println("1 is less than 2");
        }
        else
            System.out.println("2 is less than 1");
            System.out.println("Hello From IfExample");

	}
	static void program17()
	{
		int marks = 80;
        if( marks > 70 )
            System.out.println("Distinction");
        else  if( marks > 35 )
            System.out.println("Pass");
        else
            System.out.println("Fail");
            System.out.println("Better luck next time");

	}
	static void program19()
	{
		int a = 7 * 3 + 6 / 2 - 5;
        int b = 21 - 8 + a % 3 * 11;
        if(a < b)
        {
            System.out.println("A is less than B");
        }
        if(a == b)
        {
            System.out.println("A is equal to B");
        }
        if(a > b)
        {
            System.out.println("A is greater than B");
        }	
        }
		
	static void program20()
	{
		int a = 12 + 21 * 3 - 9 / 2;
        int b = 14 - 32 * 4 + 175 / 8 - 3;
        if(++a > 71 && --b < 20)
        {
            System.out.println("a = " + a + " b = " + b);
        }
        if(b-- == -97 || a-- < 100)
        {
            System.out.println("a = " + a + " b = " + b);
        }
        }
	static void program21()
	{
		float fl = 5.3f;
        if (fl == 5.3)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
        }
	
}
