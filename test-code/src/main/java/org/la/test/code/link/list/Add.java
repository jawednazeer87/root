package org.la.test.code.link.list;

public class Add {

	/*
	 * Adding two numbers
	 */
	
	public static void main(String[] args) {
		long r = add(67800, 5464);
		System.out.println("r: "+r);
	}
	
	public static long add(long i, long j) {
		long s = 0;
		long c = 0;
		StringBuilder sb = new StringBuilder();
		
		while(i>0 || j>0) {
			s = i%10 + j%10 + c;	
			i /= 10;
			j /= 10;
			c = s / 10;
			sb.insert(0, s%10);
		}
		if(c!=0) {
			sb.insert(0, c);
		}
		return Long.valueOf(sb.toString());
	}
	
}
