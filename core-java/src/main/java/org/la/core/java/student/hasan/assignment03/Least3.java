package org.la.core.java.student.hasan.assignment03;

public class Least3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=5, c=1;
		if (a<b) {
			if(a<c)
				System.out.println(a+" is smallest");
			else
				System.out.println(c+" is smallest");
		}
		else if(b<c)
			System.out.println(b+" is Smallest");
		else
			System.out.println(c+" is Smallest");
	}

}
