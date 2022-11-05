package org.jn.core.java.student.dawood.akram.weekly.week1;

public class PrePostDecOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 99;
         System.out.println("'a' Value initially : a = "+a);//99
        --a;
         int b = a;
         System.out.println("'b' value is : b = "+b);//98
         System.out.println("'a' value after PreDec : a = "+a);//98
         
         System.out.println("===============================================================");
         
         int a1 = 99;
         System.out.println("'a1' Value initially : a1 = "+a1);//99
         a1--;
         int b1 = a1;
         System.out.println("'b1' value is : b1 = "+b1);//98
         System.out.println("'a1' value after PostDec : a1 = "+a1);//98
         
         System.out.println("===============================================================");

         int a2 = 99;
         System.out.println("'a2' Value initially : a2 = "+a2);//99
         int b2 = --a2;
         System.out.println("'b2' value is : b2 = "+b2);//98
         System.out.println("'a2' value after PreDec : a2 = "+a2);//98
         
         System.out.println("===============================================================");

         int a3 = 99;
         System.out.println("'a3' Value initially : a3 = "+a3);//99
         int b3 = a3--;
         System.out.println("'b3' value is : b3 = "+b3);//99
         System.out.println("'a3' value after PreDec : a3 = "+a3);//98
         
         System.out.println("===============================================================");

         int a4 = 10;
         int b4 = --a4 * 10;
         System.out.println("'a4' after PreDec : a4 = "+a4);//9
        System.out.println("'b4' value is : b4 = "+b4);//90
        
        System.out.println("===============================================================");

        int a5 = 10;
        int b5 = a5-- * 10;
        System.out.println("'a5' after PostInc : a5 = "+a5);//9
       System.out.println("'b5' value is : b5 = "+b5);//100
         
	}

}
