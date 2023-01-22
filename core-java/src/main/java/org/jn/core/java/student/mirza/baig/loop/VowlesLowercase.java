package org.jn.core.java.student.mirza.baig.loop;

public class VowlesLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (char x='a'; x<='z'; x++) {
			
			if (x=='a'|| x=='e'|| x=='i'|| x=='o' || x=='u')
				
				continue;
			
			System.out.print(x+" ");
		}

	}

}
