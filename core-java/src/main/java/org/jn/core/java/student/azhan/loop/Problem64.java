package org.jn.core.java.student.azhan.loop;

public class Problem64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 5, exp = 4, power=1;
		for(int i=exp; i>0; i--)
			power = power * base;
		System.out.println("Power = "+power);
		
	}

}
