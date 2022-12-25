package org.jn.core.java.student.azhan.loop;

public class Problem58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345, rev=0;
		int last = num%10;
		num/=10;
		while(num != 0)
		{
			rev = (num%10) + rev*10;  
			num/=10;
		}
		int first = rev%10;
		num = rev/10; rev=last;
		while(num != 0)
		{
			rev = (num%10) + rev*10;  
			num/=10;
		}
		rev = rev*10 + first;
		System.out.println(rev);
	}

}
