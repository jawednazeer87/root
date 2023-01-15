package org.jn.core.java.student.shoaeeb.practiceset;

public class Program3 {
	//vowels present in string or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is a string To parse";
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		boolean c=(count>0 ? true:false);
		System.out.println(c);
	}

}
