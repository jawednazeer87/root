package org.jn.core.java.student.mirza.baig.method;

public class SmallestNumber {
	
	
	static int small(int []s) {
	int small=s[0];
		
		for (int i=0; i<s.length; i++)
			
			if (s[i]<small)
		
				small=s[i];
		
					System.out.println(small);
		
		return small;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [] s= {2,3,4,5,6};

small(s);
		}

}
