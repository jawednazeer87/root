package org.la.core.java.student.arfaz.forpattern;

public class FortyTwoPro {

	public static void main(String[] args) {
     int n=10,a=0,b=1,fibon=0;
     System.out.print(a+" "+b);//to get series I have to enter a b
		for(int i=1;i<n-1;i++) {//n-1 beccause we can get 5 numbers and already 1 assigned to a
			fibon=a+b;
    		 System.out.print(" "+fibon);
    		 a=b;
    		 b=fibon;
//     print fibonacci series
     }
    		  
		

	}

}
