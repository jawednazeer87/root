package org.la.core.java.student.arfaz.ifstmt;

public class NinthPro {

	public static void main(String[] args) {
		float sub1=10,sub2=20,sub3=30,sub4=40,sub5=50;
		float percentage=0;
		percentage = (sub1+sub2+sub3+sub4+sub5)/500;
		percentage=percentage*100;
		System.out.println(percentage);
		if(percentage>=60)  {
			System.out.println("Ist division");
		}
		else if(percentage>=50)
			System.out.println("IInd division");
		else if(percentage<50)
			System.out.println("IIIrd division");
	}

		
	}


