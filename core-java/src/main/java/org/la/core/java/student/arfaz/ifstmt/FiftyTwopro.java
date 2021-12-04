package org.la.core.java.student.arfaz.ifstmt;

public class FiftyTwopro {

	public static void main(String[] args) {
		int a=9,rem=0,i=0,temp=0;
        temp=a;
		while(a>0) {
			rem=a%10;
			a=a/10;
			i++;
		}
//		System.out.println(i);
		if ((temp>0&&i==2)||(i==1)) 
			System.out.println("num");
			else
			System.out.println("No");
		
		
		
      }
  }


