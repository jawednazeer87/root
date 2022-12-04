package org.jn.core.java.student.azhan.loop;

public class Problem60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234, mul=1;
		while(num != 0)
		{
			mul = mul * (num%10);
			num/=10;
		}
		System.out.println("Product = "+mul);
	}

}
