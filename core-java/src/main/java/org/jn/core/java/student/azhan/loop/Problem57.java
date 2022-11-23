package org.jn.core.java.student.azhan.loop;

public class Problem57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 92345;
		int last = num%10, first=0;
		while(num != 0)
		{
			if(num/10==0)
				first = num;
			num/=10;	
		}
		System.out.println("Sum of Fist & Last digit = "+ (first+last));
	}

}
