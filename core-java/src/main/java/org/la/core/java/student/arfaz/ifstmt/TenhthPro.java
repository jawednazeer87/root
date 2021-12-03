package org.la.core.java.student.arfaz.ifstmt;

public class TenhthPro {

	public static void main(String[] args) {
		float sub1=10,sub2=20,sub3=30,sub4=40,sub5=50;
		float percentage;
		percentage = (sub1+sub2+sub3+sub4+sub5)/500;
		percentage=percentage*100;
		System.out.println(percentage);
		if(percentage<25)  {
			System.out.println("F");
		}
		else if(percentage<=45&&percentage>=25)
			System.out.println("E");
		else if(percentage<=50&&percentage>=45)
			System.out.println("D");
		else if(percentage<=60&&percentage>=50)
			System.out.println("C");
		else if(percentage<=80&&percentage>=60)
			System.out.println("B");
		else if(percentage>80)
			System.out.println("A");
	}

		
	}


