package org.jn.core.java.student.azhan.operators.ifelse;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=110, b=20, c=10,s;
		if(a<b)
		{
			if(a<c)
				s = a;
			else
				s = c;
		}
		else
		{
			if(b<c)
				s = b;
			else
				s = c;
		}
		System.out.println("Smallest = "+s);
	}

}
