package org.jn.core.java.student.azhan.operators.ifelse;

public class Problem46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=310, b=120, c=30,gr;
		if(a>b)
		{
			if(a>c)
				gr = a;
			else
				gr = c;
		}
		else
		{
			if(b>c)
				gr = b;
			else
				gr = c;
		}
		System.out.println("Greatest = "+gr);
	}

}
