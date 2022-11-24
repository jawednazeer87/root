package org.jn.core.java.student.azhan.loop;

public class Problem61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345, rev=0;
		while(num != 0)
		{
			rev = (num%10) + rev*10;  
			num/=10;
		}
		System.out.println(rev);
	}

}
