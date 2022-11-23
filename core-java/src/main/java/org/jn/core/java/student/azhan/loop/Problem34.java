package org.jn.core.java.student.azhan.loop;

public class Problem34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=65; i<=90; i++)
		{
			char c = (char)i;
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
					continue;
			System.out.println(c);
		}
		System.out.println();
		for(int i=97; i<=122; i++)
		{
			char c = (char)i;
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
					continue;
			System.out.println(c);
		}
	}

}
