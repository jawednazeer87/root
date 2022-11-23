package org.jn.core.java.student.azhan.loop;

public class Problem55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 999,count=0;
		if(num==0)
			count++;
		while(num != 0)
		{
			count++;
			num/=10;
		}
		System.out.println("Digit = "+count);
	}

}
