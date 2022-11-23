package org.jn.core.java.student.azhan.loop;

public class Problem56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 92340;
		int l = num%10;
		while(num != 0)
		{
			if(num/10==0)
				System.out.println("First Digit = "+num);
			num/=10;	
		}
		System.out.println("Last Digit = "+l);
	}

}
